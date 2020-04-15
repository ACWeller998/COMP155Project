//@author Kaiya Wangler
public class LanternControl {

	CarPositionIndicator indicator = new CarPositionIndicator();
	
	/* Just gets the value from the CarPositionIndicator for 
	 * the car location.
	 * 
	 */
	
	public int getPosition() {
		return indicator.getFloor();
	}
}
