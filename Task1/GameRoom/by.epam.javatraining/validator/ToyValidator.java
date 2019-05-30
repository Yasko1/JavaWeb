package validator;

import model.entity.Toy;

public class ToyValidator {

	public static ToyValidatorProduct validateFromString(String[] string) {

		ToyValidatorProduct result = new ToyValidatorProduct(false);
		double price = Double.parseDouble(string[1]);
		long id = Long.parseLong(string[2]);

		for (Toy.ToyType t : Toy.ToyType.values()) {
			if (price >= 0) {
				return new ToyValidatorProduct(true, t, price, id);
			}
		}
		return result;
	}
}
