package controller;

import java.util.Optional;
import java.util.regex.Pattern;

import composite.Output;
import exception.ParserException;
import model.entity.Sentence;

public class SentenceParser extends ParserLink<Output> {

	private static final Pattern WORDS_DELIMETER = Pattern.compile("\\s");

    @Override
    public Sentence parseLine(String string) throws ParserException {
        if (string == null || string.isEmpty()) {
            throw new ParserException("Input string is emplty!");
        }
        String[] strings = string.trim().split(WORDS_DELIMETER.pattern());
        Sentence sentence = new Sentence();
        for (String s : strings) {
            Optional<Output> optional = parseNext(s);
            if (!optional.isPresent()) {
                throw new ParserException("No linked parser found!");
            }
            sentence.addElement(optional.get());
        }
        return sentence;
    }
	
}
