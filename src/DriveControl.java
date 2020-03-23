public class DriveControl {
  private int position;
	private String direction;
	
	/*
	 * The setPostion method stores a value in the
	 * position field.
	 * @param pos The value to store in position.
	 * 
	 */
	
	public void setPosition (int pos) {
		position = pos; //This will be count, and ending position
		
	}
	
	/*
	 * The setDirection method stores a value in the
	 * position field.
	 * @param dir The value to store in direction.
	 */
	
	public void setDirection (String dir) {
		direction = dir;
	}
	
	/*
	 * The getPosition method returns a DriveControl object's
	 * position.
	 * @return The value in the position field.
	 */
	
	
	public int getPosition() {
		return position;
	}
	
	/*
	 * The getDirection method returns a DriveControl object's
	 * direction.
	 * @return The value in the direction field.
	 */
	
	public String getDirection() {
		return direction;
	}
	
	
}
