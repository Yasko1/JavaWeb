package parser;

public class ToyParser {

	public static String[] parseToy(String string) {
		String[] res = string.split(", ");
		int lastIndex = res.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			res[i] = res[i].substring(res[i].lastIndexOf('=') + 1);
		}
		res[lastIndex] = res[lastIndex].substring(res[lastIndex].lastIndexOf('=') + 1, res[lastIndex].indexOf('}'));
		return res;
	}
}
