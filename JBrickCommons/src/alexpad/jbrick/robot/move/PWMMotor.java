package alexpad.jbrick.robot.move;

public interface PWMMotor {

	/**
	 * 0-100% (also filtered: power%100)
	 * 
	 * @param power
	 */
	public void setPower(int power);

	/**
	 * 0-100%
	 * 
	 * @return
	 */
	public int getPower();

}
