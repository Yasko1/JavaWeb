package model.entity;

public enum Size {

	BIG, MEDIUM, SMALL;

	public static Size makeType(String s) throws Exception {
		if (Size.BIG.toString().equalsIgnoreCase(s)) {
			return Size.BIG;
		}
		if (Size.MEDIUM.toString().equalsIgnoreCase(s)) {
			return Size.MEDIUM;
		}
		if (Size.SMALL.toString().equalsIgnoreCase(s)) {
			return Size.SMALL;
		} else
			throw new Exception("Not Type of rate");
	}

}
