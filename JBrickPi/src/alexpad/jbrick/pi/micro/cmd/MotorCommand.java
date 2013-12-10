package alexpad.jbrick.pi.micro.cmd;

import alexpad.jbrick.robot.move.MotorPort;


public class MotorCommand extends MicroCommand{
		
	
	protected int getStatus(int status, MotorPort port){
		switch(port){
			case A:
				return status | 0x00;
			case B:
				return status | 0x01;
			case C:
				return status | 0x02;
			default:
				return status | 0x03;
		}
		
	}
}
