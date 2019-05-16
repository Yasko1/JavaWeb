package model.entity;

public class Car extends Toy {

	Size size;

	public Car() {
	}

	public Car(Size size) {
		this.name = "Car";

		switch (size) {
		case BIG:
			this.size = Size.BIG;
			this.price = 29.99;
			break;
		case MEDIUM:
			this.size = Size.MEDIUM;
			this.price = 19.99;
			break;
		case SMALL:
			this.size = Size.SMALL;
			this.price = 9.99;
			break;
		}

	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		Car other = (Car) obj;
		if (size != other.size)
			return false;
		return true;
	}


}
