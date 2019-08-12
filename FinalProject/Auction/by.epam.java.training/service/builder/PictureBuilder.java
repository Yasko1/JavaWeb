package service.builder;

import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Picture;
import exception.DaoException;

public class PictureBuilder implements Builder<Picture> {


/**
 * Designed to build an object of type {@link com.epam.auction.model.User} with specified characteristics.
 */
	@Override
	public Picture build(ResultSet resultSet) throws DaoException {
		try {
		long idPicture= resultSet.getLong(Picture.ID);	
		String name = resultSet.getString(Picture.NAME_OF_PICTURE);
		int year = resultSet.getInt(Picture.YEAR_OF_PAINTING);
		
		return new Picture(idPicture, name, year);
		} catch (SQLException e) {
			throw new DaoException(e.getMessage(), e);
		}
	}

}
