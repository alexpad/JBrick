package alexpad.jbrick.robot;

import alexpad.jbrick.robot.move.MotorPort;
import alexpad.jbrick.robot.move.NXTMotor;
import alexpad.jbrick.robot.out.LCDDisplay;

public interface ApplicationContext {
	
	public LCDDisplay getLCDDisplay();
	
	public NXTMotor getNXTMotor(MotorPort port);
	

}
