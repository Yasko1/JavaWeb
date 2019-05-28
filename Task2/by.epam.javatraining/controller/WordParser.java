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
