//@author Kaiya Wangler
//Calls CarPositionIndicators
//NOT CONNECTED TO MAIN OR DISPATCHER
public class LanternControl {
	private boolean direction;
	
	CarPositionIndicator indicator = new CarPositionIndicator();
	/*
	 * The setPostion method stores a value in the
	 * position field.
	 * @param position The value to store in position.
	 * 
	 */
	
	public int setPosition (int position,int max) {
		if(position<indicator.getPosition()){
			direction = true;  //True == up
		}else
			direction = false; // false == down
		indicator.setPosition(position,max,direction);

		 //This will be count, and ending position
		return indicator.getPosition();
	}

	/*
	 * The getPosition method returns a LanternControl object's
	 * position.
	 * @return The value in the position field.
	 */
	
	
	public int getPosition() {
		return indicator.getPosition();
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
	 * The getDirection method returns a LanternControl object's
	 * direction.
	 * @return The value in the direction field.
	 */
	
	public boolean getDirection() {
		return direction;
	}
	
	
	
	
	
	
}
