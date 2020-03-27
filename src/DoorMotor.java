//@author Kaiya Wangler
public class DoorMotor {
	private boolean door;
	private String name;

public DoorMotor(String name){
	name = name;
	door = false; //default is closed.
}

	public void setDoor(boolean d) {
		door = d;
	}

	public boolean getDoor() {
		return door;
	}

}
