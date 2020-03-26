//@author Kaiya Wangler
public class DriveControl {
	private int position;
	private String direction;
	Drive drive = new Drive();
	/*
	 * The setPostion method stores a value in the
	 * position field.
	 * @param pos The value to store in position.
	 * 
	 */
	
	public String setPosition (int pos, int max) {
		int max = this.max;
		if(position<MAX){
			system.err("You fucked up");
		}
		drive.pos = this.pos; //This will be count, and ending position
		return "Floor set to " + pos ;
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
	
	public void setDirection (String dir) {
		direction = dir;
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
