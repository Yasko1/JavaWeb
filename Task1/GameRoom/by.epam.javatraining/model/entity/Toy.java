package model.entity;

public class Toy {

	public enum Fields {
		ToyType, PRICE, ID
	}

	public enum ToyType {
		BIG_CAR, MEDIUM_CAR, SMALL_CAR, DOLL, BOLL, CUBE
	}

	private double price;
	private long id;
	private Toy.ToyType toyType;

	public Toy() {
	}

	public Toy(Toy.ToyType toyType, double price, long id) {
		this.toyType = toyType;
		this.price = price;
		this.id = id;
	}

	public Toy(Toy.ToyType toyType, double price) {
		this.toyType = toyType;
		this.price = price;
		id = (long) (Math.abs(Math.random() * 100000000L * hashCode()));
	}

	public Toy(Toy.ToyType toyType) {
		this.toyType = toyType;
		this.price = 10;
		id = (long) (Math.abs(Math.random() * 100000000L * hashCode()));
	}

	public Toy.ToyType getToyType() {
		return toyType;
	}

	public void setToyType(Toy.ToyType toyType) {
		this.toyType = toyType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((toyType == null) ? 0 : toyType.hashCode());
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
		Toy other = (Toy) obj;
		if (id != other.id)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (toyType != other.toyType)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Toy [price=" + price + ", id=" + id + ", toyType=" + toyType + "]";
	}

}
