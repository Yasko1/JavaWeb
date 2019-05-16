package model.logic;

import java.util.Comparator;

import model.entity.Toy;

public class Sorting implements Comparator<Toy> {

	public int sortByCost(Toy o1, Toy o2) {
		return ((Double) o1.getPrice()).compareTo(o2.getPrice());
		}

	    public int compare(Toy o1, Toy o2) {
	        return o1.getName().compareTo(o2.getName());
	    }
}
