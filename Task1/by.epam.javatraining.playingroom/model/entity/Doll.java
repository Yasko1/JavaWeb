package model.entity;

public class Doll extends Toy {

	public Doll() {
		this.name = "Doll";
		this.price = 18.99;
	}

	public Doll(String name) {
		this.name = name;
		this.price = 18.99;
	}

	public Doll(double price, Size size) {
		name = "Doll";
		this.price = price;
	}

}
