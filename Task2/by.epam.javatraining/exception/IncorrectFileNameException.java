package exception;

public class IncorrectFileNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String fileName;
	
	public IncorrectFileNameException(String message, String fileName) {
		super(message);
		this.fileName=fileName;
	}
	
	public String getFileName() {
		return fileName;
	}

}
