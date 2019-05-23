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

	public static void main(String[] args) throws IncorrectFileNameException, EmptyListException{
		String fileName = "input.txt";

		try {
			
		List<String> linesFromFile = ReaderFromFile.readFile(fileName);
		System.out.println("READ FROM FILE: ");
		View.printFile(linesFromFile);
		
		List<Word> words = new ArrayList<>();
        Splitter.getWords(linesFromFile, words);
        System.out.println("Words:");
        View.printWords(words);
        
		} catch (IOException e) {
			System.err.println("Problem with file!");
		} catch (IncompatibleClassChangeError e) {
			System.err.println(e.getMessage());
		} 
	}

}
