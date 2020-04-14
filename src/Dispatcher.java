
public class Dispatcher {

		DriveControl driveControl = new DriveControl();
		DoorControl doorControl = new DoorControl();
		private int current;
	//FloorStatus section.
	public void setFloor(int input, int max) {
		if((input>max) || (input<1)){
			System.err.println("You done fucked it");
			return;
		}
		setDoorstatus(true);
		setDoorstatus(false);
		driveControl.setPosition(input,max);
		System.out.println("Floor was set to: " + input);
		setDoorstatus(true);
	}

	public int getFloor() {
		return driveControl.getPosition();
	}
	//DoorStatus Section. This is handled by the setFloor method automatically.
	public void setDoorstatus(boolean status){
		doorControl.setDoorStatus(status);
		getDoorstatus();
	}

	public boolean getDoorstatus(){
		if(doorControl.getDoorStatus()){
			System.out.println("Doors are open! ");
		}else
		if(!doorControl.getDoorStatus()){
			System.out.println("Doors are closed! ");
		}
		return doorControl.getDoorStatus();
	}

}


