package model.entity;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import composite.Output;

public class Word implements Output {

	private static final Logger log = LogManager.getLogger(Word.class);

	private List<Output> word;

	public Word() {
		word = new ArrayList<>();
	}

	public Word(List<Output> word) {
		this.word = word;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

	@Override
	public void outComponent() {
		log.info(toString());
	}

	@Override
	public void addElement(Output element) {
		word.add(element);		
	}

	@Override
	public List<Output> getList() {
		return word;
	}

	
}
