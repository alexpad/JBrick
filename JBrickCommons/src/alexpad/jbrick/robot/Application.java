package alexpad.jbrick.robot;

public interface Application {
	
	public void init(ApplicationContext applicationContext) throws ApplicationInitException;
	
	public void start() throws ApplicationStartException;
	
	public void stop();
	
	public void destroy();
	
}
