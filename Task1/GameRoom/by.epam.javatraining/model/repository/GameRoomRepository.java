package model.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import creator.ToyCreator;
import exception.DaoException;
import model.entity.Toy;

public class GameRoomRepository implements Repository<Toy> {

	private static final Logger log = Logger.getLogger(null);
	
	private static GameRoomRepository instance;
	private static final String DATA_FILE = "ToysList.txt";
	private static List<Toy> toys;
	private static Path path;

	private GameRoomRepository(Path directory) throws DaoException {
		try {
			if (!Files.isDirectory(directory))
				throw new DaoException("No such directory exists!");
			path = Paths.get(directory.toAbsolutePath().toString(), DATA_FILE);
			if (!Files.exists(path))
				Files.createFile(path);
			toys = ToyCreator.readFromFile(path.toString());
		} catch (IOException /* | CreatorException */ e) {
			log.info("Cannot initialize FileListPlaneRepository!" + e);
			throw new DaoException(e);
		}
	}

	public static GameRoomRepository readData(Path directory) throws DaoException {
		instance = new GameRoomRepository(directory);
		return instance;
	}

	private boolean contains(Toy x) {
		for (Toy t : toys) {
			if (t.getId() == x.getId()) {
				return true; // for unrepeatting toys id
			}
		}
		return false;
	}

	@Override
	public void add(Toy toy) throws DaoException {
		if (!contains(toy))
			toys.add(toy);
	}

	@Override
	public void remove(Toy toy) throws DaoException {
		for (Toy obj : toys) {
			if (obj.equals(toy)) {
				toys.remove(obj);
				return;
			}
		}

	}

	@Override
	public List<Toy> getAll() {
		return new ArrayList<Toy>(toys);
	}

	public static GameRoomRepository getInstance() {
		return instance;
	}

	public static void setInstance(GameRoomRepository instance) {
		GameRoomRepository.instance = instance;
	}

	@Override
	public void addAll(List<Toy> toys) {
		for(Toy t: toys) {
			if(!contains(t)) {
				toys.add(t);
			}
		}
		
	}

}
