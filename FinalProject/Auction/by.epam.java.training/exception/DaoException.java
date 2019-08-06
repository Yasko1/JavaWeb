package exception;

/**
 * Designed for signal that an database access object exception of some sort has
 * occurred.
 */
public class DaoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public DaoException() {
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(String message, Throwable cause) {
		super(message, cause);
	}

	public DaoException(Throwable cause) {
		super(cause);
	}
}
