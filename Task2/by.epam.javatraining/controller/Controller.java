package controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import exception.EmptyListException;
import exception.IncorrectFileNameException;
import exception.ParserException;
import model.entity.Text;

public class Controller {

	public Text getTextFromFile(String filePath) throws ParserException {
		try {
			Path path = Paths.get(filePath);
			byte[] bytes = Files.readAllBytes(path);
			String str = new String(bytes);
			TextParser parser = Parser.createTextParser();
			Text text = parser.parseLine(str);
			return text;
		} catch (ParserException | IOException e) {
			throw new ParserException(e);
		}
	}

	public static void main(String[] args) throws IncorrectFileNameException, EmptyListException, ParserException {
		
		String fileName = "input.txt";
		Controller control = new Controller();
		Text text = control.getTextFromFile(fileName);
		text.outComponent();

	}

}
