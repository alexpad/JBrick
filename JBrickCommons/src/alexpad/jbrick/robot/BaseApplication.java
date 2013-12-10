package alexpad.jbrick.robot;

public abstract class BaseApplication implements Application {
	
	private ApplicationContext applicationContext;
	
	@Override
    public void init(ApplicationContext applicationContext) throws ApplicationInitException {
	    this.applicationContext = applicationContext;
    }

	@Override
    public void stop() {}

	@Override
    public void destroy() {}

	protected ApplicationContext getApplicationContext() {
		return applicationContext;
	}
	

}
