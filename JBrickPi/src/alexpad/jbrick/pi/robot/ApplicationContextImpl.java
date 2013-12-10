package alexpad.jbrick.pi.robot;

import alexpad.jbrick.micro.MicroController;
import alexpad.jbrick.pi.robot.move.NXTMotorImpl;
import alexpad.jbrick.pi.robot.out.HitachiLCDDisplayImpl;
import alexpad.jbrick.robot.ApplicationContext;
import alexpad.jbrick.robot.move.MotorPort;
import alexpad.jbrick.robot.move.NXTMotor;
import alexpad.jbrick.robot.out.LCDDisplay;

public class ApplicationContextImpl implements ApplicationContext {
	
	private MicroController microController;
	
	public ApplicationContextImpl(MicroController microController) {
	    this.microController = microController;
    }

	@Override
    public NXTMotor getNXTMotor(MotorPort port) {
	    return new NXTMotorImpl(port, microController);
    }

	@Override
    public LCDDisplay getLCDDisplay() {
	    return new HitachiLCDDisplayImpl();
    }
	
	
}
