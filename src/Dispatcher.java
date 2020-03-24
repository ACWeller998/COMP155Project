//@author Kaiya Wangler
import java.util.Scanner;
//Need to make this loop through to give multiple inputs. Need to make an array.
public class Dispatcher extends MainElevatorControl {

	public static void main(String[] args) {

		Drive m = new Drive();
		DriveControl car = new DriveControl();
		
		int current = 1;
		Scanner floor = new Scanner(System.in);
		System.out.println("Enter a floor 1-3.");
		int input = floor.nextInt();
				
		if (current < input) {
			car.setPosition(input);
			car.setDirection("UP");
			int p = car.getPosition();
			String d = car.getDirection();
			m.setMovement(p,d);
		}
		
		if (current > input) {
			car.setPosition(input);
			car.setDirection("DOWN");
			int p = car.getPosition();
			String d = car.getDirection();
			m.setMovement(p,d);
			
		}
		
		System.out.println("Press 'd' to open the door.");
	
		Scanner door = new Scanner(System.in);
		String doorIn = door.nextLine();
		char answer;
		answer = doorIn.charAt(0);
		DoorMotor d  = new DoorMotor();
		DoorControl d1 = new DoorControl();
		int time = 0; //time for the delay on the door.

		
		while (time <= 10) {
			if (answer == 'd') {
				d1.setButton(true);
				boolean c = d1.getButton();
				if (c == true) {
					d.setDoor(true);
					System.out.println("The door is open.");
				}
			
			}
		
			if (answer != 'd' || time == 10) {
				d1.setButton(false);
				boolean c = d1.getButton();
				if (c == false) {
					d.setDoor(false);
					System.out.println("The door is closed.");
				}
			}
			time++;
		}
	}

}

