package service.builder;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import entity.Lot;
import entity.LotStatusEnum;
import entity.Picture;
import exception.DaoException;

/**
 * Designed to build an object of type {@link com.epam.auction.model.Lot} with
 * specified characteristics.
 */
public class LotBuilder implements Builder<Lot> {

	/**
	 * Builds an object of type Lot with properties.
	 *
	 * @param resultSet Instance of {@link java.sql.ResultSet} with property set to
	 *                  build an object type Lot.
	 * @return Returns built object type Lot.
	 * @throws DaoException Throws when SQL Exception is caught.
	 */
	@Override
	public Lot build(ResultSet resultSet) throws DaoException {
		try {
			long id = resultSet.getLong(Picture.ID);
			BigDecimal price = resultSet.getBigDecimal(Picture.PRICE);

			Timestamp dateOfStartTimeStamp = resultSet.getTimestamp(Picture.DATE_OF_START);
			long dateOfStartTimeMillisecond = dateOfStartTimeStamp.getTime();
			Date dateOfStart = new Date(dateOfStartTimeMillisecond);

			Timestamp dateOfEndTimeStamp = resultSet.getTimestamp(Picture.DATE_OF_END);
			long dateOfEndTimeMillisecond = dateOfEndTimeStamp.getTime();
			Date dateOfEnd = new Date(dateOfEndTimeMillisecond);

			String nameOfPainter = resultSet.getString(Picture.NAME_OF_PAINTER);
			String nameOfPicture = resultSet.getString(Picture.NAME_OF_PICTURE);

			int painterbirth = resultSet.getInt(Picture.DATE_OF_BIRTH);
			int dateOfPaint = resultSet.getInt(Picture.DATE_OF_PAINTING);

			long ownerId = resultSet.getLong(Picture.OWNER_ID);

			String statusString = resultSet.getString(Picture.STATUS);
			LotStatusEnum status = LotStatusEnum.findByValue(statusString);

			return new Picture(id, price, dateOfStart, dateOfEnd, status, ownerId, nameOfPainter, painterbirth,
					nameOfPicture, dateOfPaint);
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		}
	}
}
