package model.logic.factory;

import model.entity.Toy;
import exception.MyException;
import model.entity.Car;
import model.entity.Size;

public class CarFactory {

	public Toy createCar(String[] info) throws MyException {
		if (info.length != 3)
			throw new MyException();

		Car car = new Car();
		car.setName(info[0]);
		switch (info[1]) {
		case "BIG":
			car.setSize(Size.BIG);
			car.setPrice(Double.parseDouble(info[1]));
			break;
		case "MEDIUM":
			car.setSize(Size.MEDIUM);
			car.setPrice(Double.parseDouble(info[1]));
			break;
		case "SMALL":
			car.setSize(Size.SMALL);
			car.setPrice(Double.parseDouble(info[1]));
			break;
		}
		return car;
	}

}
