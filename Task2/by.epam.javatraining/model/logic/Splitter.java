package model.logic;

import java.util.List;

import exception.EmptyListException;
import model.entity.Word;

public class Splitter {

	private static String dividers = "(\\W+|\\d+)"; // regular expressions

	public static List<Word> getWords(List<String> linesFromFile, List<Word> words) throws EmptyListException {
		if (linesFromFile.isEmpty()) {
			throw new EmptyListException("File is empty!");
		}
		for (String line : linesFromFile) {
			if (!line.isEmpty()) {
				String[] wordsInOneLine = line.split(dividers);
				for (String word : wordsInOneLine) {
					if (!word.isEmpty()) {
						words.add(new Word(word));
					}
				}
			}
		}
		return words;
	}
	// add functions
	//
	// getSentenses
	//
	// getParagraphs
	//

}