//@author Kaiya Wangler
public class DriveControl {
	private boolean direction;
	Drive drive = new Drive();
	/*
	 * The setPostion method stores a value in the
	 * position field.
	 * @param pos The value to store in position.
	 * 
	 */
	
	public int setPosition (int position,int max) {
		if(position<drive.getMovement()){
			direction = true;  //True == up
		}else
			direction = false; // false == down
		drive.setMovement(position,max,direction);

		 //This will be count, and ending position
		return drive.getMovement();
	}

	/*
	 * The getPosition method returns a DriveControl object's
	 * position.
	 * @return The value in the position field.
	 */
	
	
	public int getPosition() {
		return drive.getMovement();
	}
	
	/*
	 * The setDirection method stores a value in the
	 * position field.
	 * @param dir The value to store in direction.
	 */
	
	public void setDirection (boolean dir) {
		direction = dir;
	}
	
	
	
	/*
	 * The getDirection method returns a DriveControl object's
	 * direction.
	 * @return The value in the direction field.
	 */
	
	public boolean getDirection() {
		return direction;
	}
	
	
}

