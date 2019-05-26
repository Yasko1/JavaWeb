package composite;

import java.util.List;

import exception.EmptyListException;
import model.entity.Word;

public interface WorkWithText {

	public List<Word> parseIntoWords(List<String> linesFromFile) throws EmptyListException;
	
	//add
	//public List<Sentence> parseIntoSentences(List<String> linesFromFile);
	//public List<Paragraph> parseIntoSentences(List<String> linesFromFile);
}
