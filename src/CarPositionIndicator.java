//@author Kaiya Wangler
//This class indicates the direction and position of the elevator car.
//NOT CONNECTED TO MAIN OR DISPATCHER
public class CarPositionIndicator {
	
	private int position = 1;
	private boolean direct;
	private int current = 1;
	
	/* The method setPosition stores a value in the fields
	 * direct and position.
	 * @param direction and position  The values to store in the direct and position fields.
	 */
	public void setPosition(int position,int max, boolean direction) {
		direct = direction;
		this.position = position;
	}
	
	/* The method getPosition returns a CarPositionIndicator object's
	 * position.
	 * @return The value in the position field.
	 * 
	 */
	
	public int getPosition() {
		return position;
	}
	
	/* The method getDirect returns a CarPositionIndicator object's
	 * direct.
	 * @return The value in the direct field.
	 * 
	 */
	
	public boolean getDirect() {
		return direct;
	}
	
	/* The method displayPosition displays the position
	 * and direction that the elevator car is traveling,
	 * based on the values stored in direct, current, and position.
	 * 
	 */
	
	public void displayPosition() {
		if (direct) {
			while (current < position) {
				current ++;
				System.out.println("UP");
				System.out.println(current);
			}
		}
		
		if (!direct) {
			while (current > position) {
				current --;
				System.out.println("DOWN");
				System.out.println(current);
			}
		}
		
		else {
			current = 1;
			System.out.println("UP");
			System.out.println("1");
		}
		//current = position;
		
	}
	
	
}
