package model.logic;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;


public class ToyReader {

	public static List<String> readToyFromFile(String filename) throws Throwable {
		String FILE_NAME = "data/" + filename;
		List<String> lines = Files.readAllLines(Paths.get(FILE_NAME));
		for(String a: lines) {
		System.out.println(a);
		}
		return lines;
	}

	
}