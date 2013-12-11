package alexpad.jbrick.pi;

import alexpad.jbrick.pi.micro.MicroControllerImpl;
import alexpad.jbrick.pi.robot.ApplicationContextImpl;

public class JBrickPi {
	
	// ready to go with git?
	
	private ApplicationContextImpl ctx;
	
	public JBrickPi() {
		MicroControllerImpl microController = new MicroControllerImpl();
		ctx = new ApplicationContextImpl(microController);
	}
	
	private void start(){
		
	}
	
	public static void main(String[] args) {
		new JBrickPi().start();
	}

}
