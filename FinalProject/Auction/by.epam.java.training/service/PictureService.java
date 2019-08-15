package service;

import java.util.List;

import dao.DaoCreator;
import dao.implementation.PictureDaoImplementation;
import entity.Picture;
import exception.DaoException;
import exception.ServiceException;

public class PictureService {

	public List<Picture> findByIDLot(long id) throws ServiceException {
		try (DaoCreator daoCreator = new DaoCreator()) {
			PictureDaoImplementation pictureDao = daoCreator.getPictureDaoImpl();

			return pictureDao.findPicturesByLotId(id);
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	/**
	 * The method designed for the process of saving an {@link Picture} object.
	 *
	 * @param item an {@link Picture} object that should be saved to the database.
	 * @return created lot identifier in database.
	 * @throws ServiceException Signals that service exception of some sort has
	 *                          occurred.
	 */
	public long save(Picture item) throws ServiceException {
		try (DaoCreator daoCreator = new DaoCreator()) {
			PictureDaoImplementation pictureDao = daoCreator.getPictureDaoImpl();

			return pictureDao.save(item);
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	/**
     *  Method designed for searching lot picture depends on user identifier.
     *
     * @param id - User identifier in database
     * @return an {@link List} implementation with an lot {@link entity.Picture} objects.
     * @throws ServiceException Signals that service exception of some sort has occurred.
     */
	public List<Picture> findAllByLotId(long id) throws ServiceException {

		try (DaoCreator daoCreator = new DaoCreator()) {
			PictureDaoImplementation pictureDao = daoCreator.getPictureDaoImpl();

			return pictureDao.findAllByLotId(id);

		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}
}
