package factory;

import exception.CreatorException;
import model.entity.Toy;
import model.entity.Toy.ToyType;

public class ToyFactory {

	 public static Toy factoryCreate(Toy.ToyType toyType) throws CreatorException {
		 switch(toyType) {
		 case BIG_CAR: return new Toy(ToyType.BIG_CAR);
		 case MEDIUM_CAR: return new Toy(ToyType.MEDIUM_CAR);
		 case SMALL_CAR: return new Toy(ToyType.SMALL_CAR);
		 case DOLL: return new Toy(ToyType.DOLL);
		 case BOLL: return new Toy(ToyType.BOLL);
		 case CUBE: return new Toy(ToyType.CUBE);
			 default: throw new CreatorException();
		 }
	 }
}
