package model.entity;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import composite.Output;

public class Sentence implements Output{

	private static final Logger log = LogManager.getLogger(Sentence.class);

    private final List<Output> sentences;

    private char endingSymbol = '.';

    public Sentence() {
        sentences = new ArrayList<>();
    }

    public Sentence(List<Output> wordList) {
       this.sentences = wordList;
    }

    public Sentence(List<Output> wordList, char endingSymbol) {
        this(wordList);
        setEndingSymbol(endingSymbol);
    }

    public char getEndingSymbol() {
        return endingSymbol;
    }

    public final void setEndingSymbol(char endingSymbol) {
        if (endingSymbol == '.' || endingSymbol == '!' || endingSymbol == '?') {
            this.endingSymbol = endingSymbol;
        }
    }

    @Override
    public void addElement(Output element) {
        sentences.add(element);
    }

    @Override
    public List<Output> getList() {
        return sentences;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Output word : sentences) {
            builder.append(word.toString()).append(' ');
        }
        builder.deleteCharAt(builder.length() - 1).append(endingSymbol);
        String s = new String(builder);
        return s;
    }

	@Override
	public void outComponent() {
		log.info(toString());
	}
}