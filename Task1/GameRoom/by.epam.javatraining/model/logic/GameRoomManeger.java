package model.logic;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.entity.Toy;
import model.repository.GameRoomRepository;
import model.repository.Repository;

public class GameRoomManeger {

	Repository<Toy> repository;
	
	public GameRoomManeger() {
		repository = GameRoomRepository.getInstance();
	}

	public List<Toy> sort(String parameters) {
		
		String[] req = parameters.split("\\s+");
		ToyComparator factory = new ToyComparator();
		Comparator<Toy> comparator = factory.createToyComparator(req[0]);
		for (int i = 1; i < req.length; i++) {
			comparator = comparator.thenComparing(factory.createToyComparator(req[i]));
		}
		List<Toy> list = repository.getAll();
		Collections.sort(list, comparator);
		return list;
	}
}
