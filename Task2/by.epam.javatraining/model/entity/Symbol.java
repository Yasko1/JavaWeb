package model.entity;

import java.util.Collections;
import java.util.List;

import org.apache.log4j.Logger;

import composite.Output;

public class Symbol implements Output {

	private static final Logger log = Logger.getLogger(Symbol.class);
	
	private char symbol;
	
	public Symbol(char aChar) {
        this.symbol = aChar;
    }

    public char getaChar() {
        return symbol;
    }

    @Override
    public void addElement(Output element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<Output> getList() {
        return Collections.emptyList();
    }

    @Override
    public void outComponent() {
        log.info(toString());
    }

    @Override
    public String toString() {
        return String.valueOf(symbol);
    }

}
