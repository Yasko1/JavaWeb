package controller;

import composite.Output;
import model.entity.*;

public class WordParser implements ParserChain<Output> {

    @Override
    public Word parseLine(String string) {
        String[] strings = string.split("");
        Word wordWithSymbols = new Word();
        for (String s : strings) {
            if (!s.isEmpty()) {
                wordWithSymbols.addElement(new Symbol(s.charAt(0)));
            }
        }

        return wordWithSymbols;
    }
}
	
	/*
	private static final Logger log = Logger.getLogger(SentenceParser.class);
	
	private static String dividersForWords = "(\\W+|\\d+)"; // regular expressions

	public static List<Word> getWords(List<String> linesFromFile, List<Word> words) {
		try {
		if (linesFromFile.isEmpty()) {
			throw new EmptyListException("File is empty!");
		}
		}catch(EmptyListException e) {
			log.info("File is empty, nothing to split");
		}
		for (String line : linesFromFile) {
			if (!line.isEmpty()) {
				String[] wordsInOneLine = line.split(dividersForWords);
				for (String word : wordsInOneLine) {
					if (!word.isEmpty()) {
						words.add(new Word(word));
					}
				}
			}
		}
		return words;
	}
	}*/

