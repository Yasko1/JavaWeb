package controller;

import java.util.Optional;

import exception.ParserException;

public abstract class ParserLink<T> implements ParserChain<T> {

    private ParserChain<T> next;

    public ParserLink() {
    }

    public ParserChain<T> setNext(ParserChain<T> next) {
        this.next = next;
        return this;
    }

    public Optional<T> parseNext(String parse) throws ParserException {
        if (next != null) {
            return Optional.ofNullable(next.parseLine(parse));
        }
        return Optional.empty();
    }
}
