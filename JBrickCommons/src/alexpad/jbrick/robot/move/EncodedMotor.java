package alexpad.jbrick.robot.move;

public interface EncodedMotor extends Encoder {

	/**
	 * Tacho pulses controlled rotation.<br>
	 * Motor moves forward when count>0 otherwise moves backward.<br>
	 * After count tacho pulses motor will stop and method returns.
	 * 
	 * @param tachoCount
	 */
	public void rotateAndWait(int tachoCount);

	/**
	 * Tacho pulses controlled rotation.<br>
	 * Motor moves forward when tachoCount>0 otherwise moves backward.<br>
	 * Method return immediately while motor continue rotation.
	 * 
	 * @param tachoCount
	 */
	public void rotate(int tachoCount);
	
	
	/**
	 * Wait for a previous rotate() command to complete.
	 */
	public void waitComplete();

}
