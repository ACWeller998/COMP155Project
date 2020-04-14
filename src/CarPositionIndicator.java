//@author Kaiya Wangler
//This class indicates the position of the elevator car

public class CarPositionIndicator {
	
	DriveControl driveControl = new DriveControl();
	/* The method getFloor returns the position
	 * of the elevator car.
	 * @return The floor number of the car.
	 */
	
	
	public int getFloor() {
		return driveControl.getPosition(); //This is just the position of the elevator
	}
	
	
}

