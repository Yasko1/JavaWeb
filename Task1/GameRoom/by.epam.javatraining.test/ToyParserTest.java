
import org.junit.Assert;
import org.junit.Test;

import parser.ToyParser;

public class ToyParserTest {

	String[] expected = {"DOLL,68"};
	String s1 = "Toy{ToyType=DOLL, price=54, }";
	String s2 = "Toy{ToyType=doll, price=25, }";
	
	@Test
	public void parseToyTest() {		
		String[] actual= ToyParser.parseToy(s1);
		System.out.println(actual);
		System.out.println(expected);
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void parseToyTestFailExpected() {
		String[] actual= ToyParser.parseToy(s2);
		Assert.assertNotSame(actual, expected);
	}

}
