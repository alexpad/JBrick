package alexpad.jbrick.pi.micro.cmd;

import alexpad.jbrick.robot.move.MotorPort;

public class MicroCommandFactory {
	
	public static MicroCommand newMotorPowerCommand(MotorPort port, int power){
		return new MotorPowerCommand(port, power);
	}
	
}
