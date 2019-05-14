package repository;

import java.io.IOException;

public class PlayingRoom {

	
	public String numberOfRoom; 
	public final double allocatedAmountOfMoney;
	public int countOfToys;
	
	public PlayingRoom() throws IOException {
		numberOfRoom = "number's absent";
		allocatedAmountOfMoney = ;
	}
	
	public PlayingRoom(String numberOfRoom) throws IOException {
		this.numberOfRoom = numberOfRoom;
		allocatedAmountOfMoney = System.in.read();
		
	}
		
	public String getNumberOfRoom() {
		return numberOfRoom;
	}

	public double getallocatedAmountOfMoney() {
		return allocatedAmountOfMoney;
	}

	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		return super.equals(obj);
	}

	
}
