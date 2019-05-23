package view;

import java.util.List;

import model.entity.Word;

public class View {

	public static void printFile(List<String> lines) {
		if(lines.size()==0) {
			System.out.println("Cant be printing, because lines are empty.");
		} else {
			for(String line : lines) {
				System.out.println(line);
			}
		}
	}

	public static void printWords(List<Word> words) {
		if(words.size()==0) {
			System.out.println("Cant be printing, because there are no words");
		} else {
			System.out.println(words);
		}
	}
}