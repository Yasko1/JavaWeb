package model.logic.factory;

import model.entity.Toy;
import exception.MyException;
import model.entity.Doll;

public class DollFactory {

	public Toy createDoll(String[] info) throws MyException {
		if(info.length!=2)
			throw new MyException();
		
		Doll doll =new Doll();
		doll.setName(info[0]);
		doll.setPrice(Double.parseDouble(info[1]));
		return doll;
	}
	
	  
}
