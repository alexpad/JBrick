package alexpad.jbrick.pi.robot.move;

import alexpad.jbrick.micro.MicroController;
import alexpad.jbrick.pi.micro.cmd.MicroCommand;
import alexpad.jbrick.pi.micro.cmd.MicroCommandFactory;
import alexpad.jbrick.robot.move.MotorPort;
import alexpad.jbrick.robot.move.NXTMotor;

public class NXTMotorImpl implements NXTMotor{
	
	private final MotorPort port;
	private MicroController microController;
	
	private int power;
	
	public NXTMotorImpl(MotorPort port, MicroController microController) {
	    this.port = port;
	    this.microController = microController;
    }

	@Override
    public void setPower(int power) {
	    this.power = power%100;
	    MicroCommand cmd = MicroCommandFactory.newMotorPowerCommand(port, power);
	    microController.writePic(cmd.getBytes());
    }

	@Override
    public int getPower() {
	    return power;
    }

	@Override
    public void forward() {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public void backward() {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public void reverse() {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public void brake() {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public void floating() {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public void rotateAndWait(int tachoCount) {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public void rotate(int tachoCount) {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public void waitComplete() {
	    // TODO Auto-generated method stub
	    
    }

	@Override
    public int getTachoCount() {
	    // TODO Auto-generated method stub
	    return 0;
    }

	@Override
    public void resetTachoCount() {
	    // TODO Auto-generated method stub
	    
    }

	public MotorPort getPort() {
		return port;
	}
	
}
