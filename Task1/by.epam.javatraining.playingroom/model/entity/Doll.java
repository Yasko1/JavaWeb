package model.entity;

public class Doll extends Toy {

	public final String NICKNAME;

	public Doll() {
		NICKNAME = "";
		name = "Cube";
		this.price = 18.99;
		this.size = Size.MEDIUM;
	}

	public Doll(double price, String nickname, Size size) {
		name = "Cube";
		NICKNAME = nickname;
		this.price = price;
		this.size = size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((NICKNAME == null) ? 0 : NICKNAME.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doll other = (Doll) obj;
		if (NICKNAME == null) {
			if (other.NICKNAME != null)
				return false;
		} else if (!NICKNAME.equals(other.NICKNAME))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (size != other.size)
			return false;
		return true;
	}

}
