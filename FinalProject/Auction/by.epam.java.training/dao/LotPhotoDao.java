package dao;

import java.util.List;

import entity.LotPhoto;
import exception.DaoException;

public interface LotPhotoDao {
	/**
	 * Method designed for searching lot photos depends on lot identifier.
	 *
	 * @param id - Lot identifier in database
	 * @return an {@link List} implementation with an lot {@link LotPhoto} objects.
	 * @throws DaoException Signals that an database access object exception of some
	 *                      sort has occurred.
	 */
	List<LotPhoto> findLotPhotosByLotId(long id) throws DaoException;

}
