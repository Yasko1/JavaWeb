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
	//private static final Logger log = Logger.getLogger(SentenceParser.class);
	
	//private static String dividersForSentences = "[A-Z]{1}[[\\w|,|']*| ]*[.!?]";

//	public static List<Sentence> getSentenses(List<String> linesFromFile, List<Sentence> sentences) {
//		try {
//			if (linesFromFile.isEmpty()) {
//				throw new EmptyListException("File is empty!");
//			}
//		} catch (EmptyListException e) {
//			log.info("File is empty, nothing to split");
//		}
//		for (String line : linesFromFile) {
//			if (!line.isEmpty()) {
//				String[] wordsInOneLine = line.split(dividersForSentences);
//				for (String sentence : wordsInOneLine) {
//					if (!sentence.isEmpty()) {
//						sentences.add(new Sentence(sentence));
//					}
//				}
//			}
//		}
//		return sentences;
//	}
}