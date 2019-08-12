package entity;

import java.math.BigDecimal;
import java.util.Date;

public class Picture extends Painter {

	private long idPicture;
	private String nameOfPicture;
	private int yearOfPainting;

	public static final String NAME_OF_PICTURE = "name";
	public static final String YEAR_OF_PAINTING = "year_of_painting";

	public Picture() {
	}

	public Picture(long idPicture, String name, int dateOfPainting) {
		this.idPicture = idPicture;
		this.nameOfPicture = name;
		this.yearOfPainting = dateOfPainting;
	}

	public Picture(long idLot, BigDecimal price, Date dateOfStart, Date dateOfEnd, LotStatusEnum status, long ownerId,
			String nameOfPainter, String surnameOfPainter, String nameOfPicture, int dateOfPaint) {
		this.idLot = idLot;
		this.price = price;
		this.dateOfStart = dateOfStart;
		this.dateOfEnd = dateOfEnd;
		this.status = status;
		this.nameOfPainter = nameOfPainter;
		this.surnameOfPainter=surnameOfPainter;
		this.nameOfPicture = nameOfPicture;
		this.yearOfPainting=dateOfPaint;
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
		return yearOfPainting;
	}

	public void setDateOfPainting(int dateOfPainting) {
		this.yearOfPainting = dateOfPainting;
	}

}
