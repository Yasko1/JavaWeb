package creator;

import org.junit.Assert;
import org.junit.Test;

import exception.CreatorException;
import model.entity.Toy;

public class ToyCreaterTest {

	@Test
	public void createFromStringNormal() throws CreatorException {
		String validString = "Toy{ToyType=DOLL, price=10.9, id=-1}";
		Toy toy1 = null;
		toy1 = ToyCreator.createFromString(validString);
		Toy toy2 = new Toy(Toy.ToyType.DOLL, 10.9, -1);
		Assert.assertEquals(toy2, toy1);
	}

	@Test(expected = CreatorException.class)
	public void createFromStringParseError() throws CreatorException {
		String invalidString = "Toy{ToyType=DOLL, price=abc, id=-1}";
		ToyCreator.createFromString(invalidString);
		Assert.fail();
	}

	@Test(expected = CreatorException.class)
	public void createFromStringInvalidParameters() throws CreatorException {
		String invalidString = "Toy{ToyType=1, price=10.9, id=-1}";
		ToyCreator.createFromString(invalidString);
		Assert.fail();
		
	}

}
