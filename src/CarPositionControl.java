//@author Kaiya Wangler
import java.util.Scanner;

public class CarPositionControl {
	public static void main(String[] args) {
	
	CarPositionIndicator indicator = new CarPositionIndicator();
	
	Scanner floor = new Scanner(System.in);
	System.out.println("Enter a floor 1-3.");
	int input = floor.nextInt();
	
	Scanner maxFloor = new Scanner(System.in);
	System.out.println("What is the maximum floor of the building?");
	int max = maxFloor.nextInt();
	
	int defFloor = 1;
	
	indicator.setFloorNum(input, defFloor);
	int f = indicator.getFloorNum();
	int d = indicator.getDefaultFloor();
	
	if (f < max && f != d) {
		while(d <= max) {
			System.out.println("The floor you are on is " + (d));
			d++;
			}		
		}
	if (f == d) {
		System.out.println("This is the ground floor");
	}
//Need a loop to go down.


	
	}
}
