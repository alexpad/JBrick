package alexpad.jbrick.robot;

@SuppressWarnings("serial")
public class ApplicationStartException extends Exception {

	public ApplicationStartException(String message) {
		super(message);
	}

	public ApplicationStartException(Throwable cause) {
		super(cause);
	}

	public ApplicationStartException(String message, Throwable cause) {
		super(message, cause);
	}

}
