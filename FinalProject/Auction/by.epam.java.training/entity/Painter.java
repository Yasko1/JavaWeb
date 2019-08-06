package entity;

public class Painter extends Lot {

	protected long idPainter;
	protected String nameOfPainter;
	protected int painterbirth;

	public static final String NAME_OF_PAINTER = "name of painter";
	public static final String DATE_OF_BIRTH = "date of painter birth";

	public Painter() {
	}

	public Painter(long idPainter, String name, int dateOfBirth) {
		this.idPainter = idPainter;
		this.nameOfPainter = name;
		this.painterbirth = dateOfBirth;
	}

	public long getIdPainter() {
		return idPainter;
	}

	public void setIdPainter(long idPainter) {
		this.idPainter = idPainter;
	}

	public String getName() {
		return nameOfPainter;
	}

	public void setName(String name) {
		this.nameOfPainter = name;
	}

	public int getDateOfBirth() {
		return painterbirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.painterbirth = dateOfBirth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + painterbirth;
		result = prime * result + (int) (idPainter ^ (idPainter >>> 32));
		result = prime * result + ((nameOfPainter == null) ? 0 : nameOfPainter.hashCode());
		// result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Painter other = (Painter) obj;
		if (painterbirth != other.painterbirth)
			return false;
		if (idPainter != other.idPainter)
			return false;
		if (nameOfPainter == null) {
			if (other.nameOfPainter != null)
				return false;
		} else if (!nameOfPainter.equals(other.nameOfPainter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Painter [idPainter=" + idPainter + ", nameOfPainter=" + nameOfPainter + ", painterbirth=" + painterbirth
				+ "]";
	}

}
