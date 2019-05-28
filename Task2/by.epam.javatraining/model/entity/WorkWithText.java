package model.entity;

import java.util.List;

import exception.EmptyListException;

public interface WorkWithText {

	public List<Word> parseIntoWords(List<String> linesFromFile) throws EmptyListException;
	
}
