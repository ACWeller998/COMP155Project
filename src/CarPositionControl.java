//@author Kaiya Wangler

public class CarPositionControl {
	private int location;
	
	
	public void setControlPosition(int l) {
		location = l;
	}
	
	public int getControlPosition() {
		
		CarPositionIndicator indicator = new CarPositionIndicator();
		
		int defFloor = 1;
		
		indicator.setFloorNum(location, defFloor);
		int f = indicator.getFloorNum();
		int d = indicator.getDefaultFloor();
		
		if (f < 3 && f != d) { //Making this to 3 floors until later (as a placeholder)
			while(d <= 3) {
				//System.out.println("The floor you are on is " + (d)); //For testing
				d++;
				}		
			}
		if (f == d) {
			System.out.println("This is the ground floor");
			
		}
		
		return d;
		
		
		//Need a loop to go down
	}
	
}

