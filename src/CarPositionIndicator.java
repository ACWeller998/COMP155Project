//@author Kaiya Wangler
public class CarPositionIndicator {
	private int floorNum;
	private int defaultFloor;
	
	/* The method setFloorNum stores a value in the floorNum and defaultFloor
	 * fields.
	 * @param f and d The values that are stored in the fields floorNum
	 * and defaultFloor 
	 */

	public void setFloorNum (int f, int d) {
		floorNum = f;
		defaultFloor = d;
		
	}
	
	/*The method getDefaultFloor returns an object of the class.
	 * @return The value in the defaultFloor field.
	 */
	
	public int getDefaultFloor() {
		return defaultFloor;
	}
	
	/*The method getFloorNum returns an object of the class.
	 * @return The value in the floorNum field. 
	 */
	
	public int getFloorNum() {
		return floorNum;
	}
	
	
}
