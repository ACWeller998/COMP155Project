//@author Kaiya Wangler
import java.util.Scanner;
//Need to make this loop through to give multiple inputs. Need to make an array.
public class Dispatcher {

		DriveControl driveControl = new DriveControl();
		private int current; //Maybe don't need

	public void setFloor(int input, int max) {
		driveControl.setPosition(input,max);
		System.out.println("Floor was set to" + input);
	}
	public int getFloor() {
	return driveControl.getPosition();
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


