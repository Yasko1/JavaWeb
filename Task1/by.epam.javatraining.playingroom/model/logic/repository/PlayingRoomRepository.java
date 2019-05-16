package model.logic.repository;

import model.entity.Toy;
import view.View;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.LogManager;

import exception.MyException;

public class PlayingRoomRepository {

	static {
		LogManager.getLogManager();
	}

	public static final double ALLOCATED_MONEY = 100;

	private static PlayingRoomRepository instanse;
	private List<Toy> toys;
	private static String DATA_FILE = "data/database";

	public PlayingRoomRepository(List<Toy> toys) {
		this.toys = toys;
	}

	public static PlayingRoomRepository getInstance(List<Toy> toys) {
		if (instanse == null) {
			instanse = new PlayingRoomRepository(toys);
		}
		return instanse;
	}

	public void add(Toy toy) {
		if (toys.contains(toy)) {
			new MyException("You cant add toy");
		}
		toys.add(toy);
		PrintWriter writer =  null;
		try {
			writer = new PrintWriter(DATA_FILE);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		writer.println(toy.toString());
	}

	public void delete(Toy toy) {
		if (!toys.contains(toy)) {
			new MyException("Such toy absent");
		}
		toys.remove(toy);
		View.out("Toy is deleted");
	}
	
}
