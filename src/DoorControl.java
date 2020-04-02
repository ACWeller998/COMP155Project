//@author Kaiya Wangler
public class DoorControl {
	DoorMotor door1 = new DoorMotor("Door1");
	DoorMotor door2 = new DoorMotor("Door2");

	private boolean buttonDoor;
	/*
	 * The method setButton stores a value in the field
	 * buttonDoor.
	 * @param b The value to store in the buttonDoor field. 
	 */
	public void setButton(boolean b) {
		buttonDoor = b;
	}
	
	/*
	 * The method getButton returns a DoorControl
	 * object.
	 * @return The value in the buttonDoor field.
	 */
	public boolean getButton() {
		return buttonDoor;
	}
	//DoorStatus Section.
	public void setDoorStatus(boolean status){
		if(status){
			door1.setDoor(true);  //open
			door2.setDoor(true);  //open
		}else {
			door1.setDoor(false); //closed
			door2.setDoor(false); //closed
		}
	}

	public boolean getDoorStatus() {
	if((door1.getDoor())&(door2.getDoor())){
		return true; //true for open
		}else
	return false; //false for closed
	}
}
