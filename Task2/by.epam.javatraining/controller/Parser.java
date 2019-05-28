package controller;

public class Parser {

	private Parser() {
	}

	public static TextParser createTextParser() {
		TextParser parser = new TextParser();
		parser.setNext(new ParagraphParser()
				.setNext(new SentenceParser()
						.setNext(new WordParser())));
		return parser;

	}
}
