package controller;

import exception.ParserException;

public interface ParserChain<T> {
    T parseLine(String string) throws ParserException;
}
