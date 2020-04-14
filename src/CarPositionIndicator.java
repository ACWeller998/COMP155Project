//@author Kaiya Wangler
//This class indicates the position of the elevator car

public class CarPositionIndicator {
	
	DriveControl driveControl = new DriveControl();
	
	public int getFloor() {
		return driveControl.getPosition(); //This is just the position of the elevator
	}
	
	
}

