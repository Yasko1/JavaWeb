package view;

import java.util.List;

import model.entity.Toy;

public class View {

	public static void out(String task) {
		System.out.println(task);
	}

	 private String out(List<Toy> toys) {
	        String result = "\nOutput:\n";
	        for (Toy toy : toys) {
	            result += toy.toString() + "\n";
	        }
	        result += getResult(toys);
	        return result;
	    }
	 private String getResult(List<Toy> toys) {
	        return "\nUsed moneys: " + getTotalCost(toys) +
	                " of total: " + maxMoneys +
	                "\nUsed toys: " + toys.size() +
	                " of total: " + maxToys;
}
