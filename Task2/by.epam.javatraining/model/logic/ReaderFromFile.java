package model.logic;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import exception.IncorrectFileNameException;

public class ReaderFromFile {

	public static List<String>  readFile(String fileName) throws IOException, IncorrectFileNameException{
		if(fileName.isEmpty()) {
			throw new IncorrectFileNameException("Problems with file!", fileName);
		}
		return Files.readAllLines(Paths.get(fileName),StandardCharsets.UTF_8);
	}
	public ReaderFromFile() {
	}

}
