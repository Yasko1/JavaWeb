package entity;

import java.math.BigDecimal;
import java.util.Date;

public class Picture extends Painter {

	private long idPicture;
	private String nameOfPicture;
	private int dateOfPainting;

	public static final String NAME_OF_PICTURE = "picture name";
	public static final String DATE_OF_PAINTING = "date of paint";

	public Picture() {
	}

	public Picture(long idPicture, String name, int dateOfPainting) {
		this.idPicture = idPicture;
		this.nameOfPicture = name;
		this.dateOfPainting = dateOfPainting;
	}

	public Picture(long idLot, BigDecimal price, Date dateOfStart, Date dateOfEnd, LotStatusEnum status, long ownerId,
			String nameOfPainter, int painterbirth, String nameOfPicture, int dateOfPaint) {
		this.idLot = idLot;
		this.price = price;
		this.dateOfStart = dateOfStart;
		this.dateOfEnd = dateOfEnd;
		this.status = status;
		this.nameOfPainter = nameOfPainter;
		this.painterbirth = painterbirth;
		this.nameOfPicture = nameOfPicture;
		this.dateOfPainting=dateOfPaint;
		this.ownerId = ownerId;
	}

	public long getId() {
		return idPicture;
	}

	public void setId(long id) {
		this.idPicture = id;
	}

	public String getName() {
		return nameOfPicture;
	}

	public void setName(String name) {
		this.nameOfPicture = name;
	}

	public int getDateOfPainting() {
		return dateOfPainting;
	}

	public void setDateOfPainting(int dateOfPainting) {
		this.dateOfPainting = dateOfPainting;
	}

}
