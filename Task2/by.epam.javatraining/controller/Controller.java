package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import exception.EmptyListException;
import exception.IncorrectFileNameException;
import model.entity.Word;
import model.logic.ReaderFromFile;
import model.logic.Splitter;
import view.View;

public class Controller {

	public static void main(String[] args) throws IncorrectFileNameException, EmptyListException {
		String fileName = "input.txt";

		try {

			List<String> linesFromFile = ReaderFromFile.readFile(fileName);
			View.printFile(linesFromFile);

		} catch (IOException e) {
			System.err.println("Problem with file!");
		} catch (IncompatibleClassChangeError e) {
			System.err.println(e.getMessage());
		}
	}

}
