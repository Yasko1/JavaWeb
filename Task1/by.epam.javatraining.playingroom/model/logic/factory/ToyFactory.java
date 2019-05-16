package model.logic.factory;

import model.logic.repository.PlayingRoomRepository;

public interface ToyFactory {

	PlayingRoomRepository createBoll(String[] info);
	PlayingRoomRepository createDoll(String[] info);
	PlayingRoomRepository createCar(String[] info);
	
}