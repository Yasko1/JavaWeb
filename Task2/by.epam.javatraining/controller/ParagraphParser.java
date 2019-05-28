package controller;

import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import composite.Output;
import exception.ParserException;
import model.entity.Paragraph;
import model.entity.Sentence;

public class ParagraphParser extends ParserLink<Output> {
	
	private static final Pattern SENTENCE_DELIMETER = Pattern.compile("[.!?]\r?");
    private static final Pattern SENTENCE_ENDING = Pattern.compile("[.!?]");

    @Override
    public Paragraph parseLine(String string) throws ParserException {
        if (string == null || string.isEmpty()) {
            throw new ParserException("Input string is emplty!");
        }
        Paragraph paragraph = new Paragraph();
        String[] strings = string.trim().split(SENTENCE_DELIMETER.pattern());
        char[] endingSymbols = new char[strings.length];
        Matcher matcher = SENTENCE_ENDING.matcher(string);
        int i = 0;
        while (matcher.find()) {
            endingSymbols[i++] = string.charAt(matcher.start());
        }
        for (int j = 0; j < strings.length; j++) {
            Optional<Output> optional = parseNext(strings[j]);
            if (!optional.isPresent()) {
                throw new ParserException("No linked parser found!");
            }
            Sentence sentence = ((Sentence) optional.get());
            sentence.setEndingSymbol(endingSymbols[j]);
            paragraph.addElement(sentence);
        }

        return paragraph;
    }

}
