package model.logic.factory;

import exception.MyException;
import model.entity.Boll;
import model.entity.Toy;

public class BollFactory {

	public Toy createBoll(String[] info) throws MyException {
		if(info.length!=2)
			throw new MyException();
		
		Boll boll =new Boll();
		boll.setName(info[0]);
		boll.setPrice(Double.parseDouble(info[1]));
		return boll;
	}

}
