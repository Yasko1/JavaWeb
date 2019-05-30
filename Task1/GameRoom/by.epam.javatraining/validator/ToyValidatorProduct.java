package validator;

import model.entity.Toy;

public class ToyValidatorProduct {

	public boolean isValid;
	private Toy.ToyType toyType;
	private double price;
	private long id;

	public ToyValidatorProduct(boolean isValid) {
		this.isValid = isValid;
	}

	public ToyValidatorProduct(boolean isValid, Toy.ToyType toyType, double price, long id) {
		this.isValid = isValid;
		this.toyType=toyType;
		this.price = price;
		this.id = id;
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Toy.ToyType getToyType() {
		return toyType;
	}

	public void setToyType(Toy.ToyType toyType) {
		this.toyType = toyType;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
}
