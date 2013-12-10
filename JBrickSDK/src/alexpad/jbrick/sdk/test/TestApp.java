package alexpad.jbrick.sdk.test;

import alexpad.jbrick.robot.ApplicationContext;
import alexpad.jbrick.robot.ApplicationStartException;
import alexpad.jbrick.robot.BaseApplication;
import alexpad.jbrick.robot.move.MotorPort;
import alexpad.jbrick.robot.move.NXTMotor;
import alexpad.jbrick.robot.out.LCDDisplay;
import alexpad.jbrick.robot.util.Delay;

public class TestApp extends BaseApplication{
	
	
	@Override
    public void start() throws ApplicationStartException {
		ApplicationContext ctx = getApplicationContext();
		
		LCDDisplay display = ctx.getLCDDisplay();
		display.clear();
		
		NXTMotor motorA = ctx.getNXTMotor(MotorPort.A);
		
		display.print(2, 0, "MotorA forward");
	    motorA.forward();
	    Delay.delaySecs(5);
	    
	    display.print(2, 0, "MotorA backward");
	    motorA.reverse();
	    Delay.delaySecs(5);
	    
	    display.print(2, 0, "MotorA braking");
	    motorA.brake();
	    Delay.delaySecs(5);
	    
	    display.print(2, 0, "MotorA floating");
	    motorA.floating();
	    Delay.delaySecs(5);
    }
	

}
