package controller;

import java.util.Optional;
import java.util.regex.Pattern;
import model.entity.Text;
import composite.Output;
import exception.ParserException;

public class TextParser extends ParserLink<Output> {

	private static final Pattern PARAGRAPH_DELIMETER = Pattern.compile("\n(\\s{4,}|\t)");

	
	@Override
	public Text parseLine(String string) throws ParserException {
		if (string == null || string.isEmpty()) {
			throw new ParserException("Input string is emplty!");
		}
		Text text = new Text();
		String[] strings = string.trim().split(PARAGRAPH_DELIMETER.pattern());
		for (String s : strings) {
			Optional<Output> optional = parseNext(s);
			if (!optional.isPresent()) {
				throw new ParserException("No linked parser found!");
			}
			text.addElement(optional.get());
		}
		return text;
	}
}
