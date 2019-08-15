package dao;

import java.util.List;

import entity.Identifiable;
import entity.Picture;
import exception.DaoException;

public interface PictureDao {

	/**
	 * Method designed for searching picture depends on id of lot identifier.
	 *
	 * @param id - User identifier in database
	 */
	List<Picture> findPicturesByLotId(long id) throws DaoException;
	
	public List<Picture> findAllByLotId(long id) throws DaoException;
	
	public long save(Identifiable item) throws DaoException ;
	
}
