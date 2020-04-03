//@author Kaiya Wangler

//Need to make this loop through to give multiple inputs. Need to make an array.
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

//		//System.out.println("Press 'd' to open the door.");
//		Scanner door = new Scanner(System.in);
//		String doorIn = door.nextLine();
//		char answer;
//		//answer = doorIn.charAt(0);
//		DoorMotor d  = new DoorMotor();
//		DoorControl d1 = new DoorControl();
//		int time = 0; //time for the delay on the door.

		
//		while (time <= 10) {
//			if (answer == 'd') {
//				d1.setButton(true);
//				boolean c = d1.getButton();
//				if (c == true) {
//					d.setDoor(true);
//					System.out.println("The door is open.");
//				}
//
//			}
//
//			if (answer != 'd' || time == 10) {
//				d1.setButton(false);
//				boolean c = d1.getButton();
//				if (c == false) {
//					d.setDoor(false);
//					System.out.println("The door is closed.");
//				}
//			}
//			time++;
//		}
}


