package composite;

import java.util.ArrayList;
import java.util.List;

import exception.EmptyListException;
import model.entity.Word;
import model.logic.Splitter;

public class CompaundText implements WorkWithText {

	List<Word> words = new ArrayList<>();

	public CompaundText(List<String> linesFromFile) throws EmptyListException {
		words = Splitter.getWords(linesFromFile, words);
	}

	public void add(int position, Word element) {
		words.add(position, element);
	}

	public void remove(int position) {
		words.remove(position);
	}

	public List<Word> parseIntoWords(List<String> linesFromFile) throws EmptyListException {
		Splitter.getWords(linesFromFile, words);
		return words;
	}

}
