package model.entity;

public class Boll extends Toy {

	private final Color color;

	public Boll() {
		name = "Boll";
		color = Color.ORANGE;
		price = 19.99;
		size = Size.MEDIUM;

	}

	public Boll(double price, Color color, Size size) {
		this.name = "Boll";
		this.color = color;
		this.price = price;
		this.size = size;
	}

	public Color getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		Boll other = (Boll) obj;
		if (color != other.color)
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
