package alexpad.jbrick.pi.micro.cmd;

import alexpad.jbrick.robot.move.MotorPort;


public class MotorPowerCommand extends MotorCommand{
	
	/*
	 * 1 0 1 0  0 0 p p -> 7:STATUS 6-4:MOTOR_POWER(010) 3-2:unused 2-1:port(0-3) 
	 * 0 v v v  v v v v -> power value 0-100
	 * 
	 */
	
	public static final byte STATUS = (byte)0xA0;
	
	protected MotorPowerCommand(MotorPort port, int power) {
		setBytes(new byte[]{
			(byte)getStatus(STATUS, port),
			(byte)(power & 0xFF)
		});
	}	
	
}
