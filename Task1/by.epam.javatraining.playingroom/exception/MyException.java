package exception;

public class MyException extends Exception {

	public MyException() {
	}
	
	public MyException(String message) {
		super(message);
	}
	
	public MyException(String message, Throwable e) {
		super(message, e);
	}
	
	public MyException(Throwable e) {
		super(e);
	}
}