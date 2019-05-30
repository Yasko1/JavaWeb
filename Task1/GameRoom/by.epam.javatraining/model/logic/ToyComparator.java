package model.logic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import model.entity.Toy;
import model.entity.Toy.Fields;

public class ToyComparator {

	private final Map<Fields, Comparator<Toy>> rep = new HashMap<>();

    public ToyComparator() {
    	this.rep.put(Fields.ToyType, Comparator.comparing(Toy::getToyType));
        this.rep.put(Fields.PRICE, Comparator.comparingDouble(Toy::getPrice));
        this.rep.put(Fields.ID, Comparator.comparing(Toy::getId));
    }
    
	public Comparator<Toy> createToyComparator(String string) {
        return this.rep.get(Toy.Fields.valueOf(string));
	}

}
