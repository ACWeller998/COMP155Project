public class DoorControl {
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
}
