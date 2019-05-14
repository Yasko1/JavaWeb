package model.entity;

public class Cube extends Toy {

	public Cube() {
		name = "Cube";
		this.price = 18.99;
		this.size = Size.MEDIUM;
	}

	public Cube(double price, Size size) {
		name = "Cube";
		this.price = price;
		this.size = size;
	}

}
