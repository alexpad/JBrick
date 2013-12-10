package alexpad.jbrick.robot.out;

public interface LCDDisplay {
	
	/**
	 * Clear display and set location at row 0 col 0.
	 */
	public void clear();
	
	/**
	 * Clear a single display row and set location at col 0 of specified row.
	 * @param row
	 */
	public void clear(int row);
	
	/**
	 * Move cursor at row 0 col 0.
	 */
	public void home();
	
	/**
	 * Move cursor at col 0 of specified row.
	 */
	public void home(int row);
	
	/**
	 * Move cursor at specified row and col.
	 * @param row
	 * @param col
	 */
	public void setLocation(int row, int col);
	
	public void print(int row, int col, String str, Object... args);
	
	public void print(String str, Object... args);
	
	
}
