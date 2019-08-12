package dao.implementation;

import java.sql.Connection;
import java.util.List;

import dao.AbstractDao;
import dao.PictureDao;
import entity.Identifiable;
import entity.Picture;
import exception.DaoException;
import service.builder.PictureBuilder;

public class PictureDaoImplementation extends AbstractDao<Picture> implements PictureDao {
	
	private static final String INSERT_QUERY= "INSERT INTO picture (name, year_of_painting) VALUES(?,?)";
	private static final String TABLE_NAME = "picture";
	private static final String PICTURE_BY_LOT_ID_QUERY = "SELECT * FROM picture where id_picture = ?";
	
	public PictureDaoImplementation(Connection connection) {
		super(connection);
	}
	
	@Override
	public List<Picture> findPictureByLotId(long id) throws DaoException {
		String idParameter = String.valueOf(id);
		return executeQuery(PICTURE_BY_LOT_ID_QUERY, new PictureBuilder(), idParameter);
	}

	@Override
	public long save(Identifiable item) throws DaoException {
		Picture picture = (Picture) item;
		
		String nameOfPicture=picture.getName();
		
		int yearOfPainting = picture.getDateOfPainting();
		String yearOfPaintingString = String.valueOf(yearOfPainting);
		
		return executeUpdate(INSERT_QUERY, nameOfPicture, yearOfPaintingString);
	}

	@Override
	protected String getTableName() {		
		return TABLE_NAME;
	}
	
	

}
