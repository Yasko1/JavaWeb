package creator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import model.entity.Toy;
import parser.ToyParser;
import validator.ToyValidator;
import validator.ToyValidatorProduct;
import view.View;

public class ToyCreator {

	public static Toy createFromString(String string) {

		String[] parsed = ToyParser.parseToy(string);
		ToyValidatorProduct product = ToyValidator.validateFromString(parsed);
		Toy toy = null;

		if (product.isValid) {
			toy = product.getId() < 0 ? new Toy(product.getToyType(), product.getPrice())
					: new Toy(product.getToyType(), product.getPrice(), product.getId());
		} else {
			View.out("Input has invalid parametrs");
		}
		return toy;
	}

	public static List<Toy> readFromFile(String file) throws IOException {

		List<Toy> toys = new ArrayList<>();
		Path path = Paths.get(file);

		if (Files.exists(path)) {
			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				toys.add(createFromString(line));
			}
			return toys;
		} else {
			View.out("No file.");
			return null;
		}

	}

}
