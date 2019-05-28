package model.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import composite.Output;

public class Paragraph implements Output {

	private static final Logger log = LogManager.getRootLogger();

	private final List<Output> sentenceList;

    public Paragraph(List<Output> sentenceList) {
       this.sentenceList = sentenceList;
    }

    public Paragraph() {
        sentenceList = new ArrayList<>();
    }

    @Override
    public void addElement(Output element) {
        sentenceList.add(element);
    }

    @Override
    public List<Output> getList() {
        return sentenceList;
    }

    @Override
    public void outComponent() {
        log.info(toString());
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append('\t');
        for (Output sentence : sentenceList) {
            builder.append(sentence.toString()).append(' ');
        }
        builder.deleteCharAt(builder.length() - 1);
        builder.append('\n');
        String s = new String(builder);
        return s;
    }
}
