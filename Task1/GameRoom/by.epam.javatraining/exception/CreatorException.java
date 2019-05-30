package exception;

public class CreatorException extends Exception{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CreatorException(){super();}
    public CreatorException(String name, Throwable exception){super(name,exception);}
    public CreatorException(String name){super(name);}
    public CreatorException(Throwable exception){super(exception);}
}