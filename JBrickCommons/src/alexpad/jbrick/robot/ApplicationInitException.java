package alexpad.jbrick.robot;

@SuppressWarnings("serial")
public class ApplicationInitException extends Exception {

	protected ApplicationInitException(String message, Throwable cause) {
	    super(message, cause);
    }

	protected ApplicationInitException(String message) {
	    super(message);
    }

	protected ApplicationInitException(Throwable cause) {
	    super(cause);
    }
	
}
