
  //@author Kaiya Wangler
public class Drive {
	
	private int position;
	private String direct;
	private int current = 1;
	
	/* The method setMovement stores a value in the fields
	 * direct and position.
	 * @param d and p The values to store in the direct and position fields.
	 */
	public void setMovement(int p, String d) {
		direct = d;
		position = p;
	}
	
	/* The method getMovement returns a Drive object's
	 * position.
	 * @return The value in the position field.
	 * 
	 */
	
	public int getMovement() {
		return position;
		
	}
	
	/* The method getDirect returns a Drive object's
	 * direct.
	 * @return The value in the direct field.
	 * 
	 */
	
	public String getDirect() {
		return direct;
	}
	
	/* The method calculateMovement returns a Drive object's
	 * position after changing current to the new positionition.
	 * @return The value in the position field.
	 * 
	 */
	
	public int calculateMovement() {
		if (direct == "UP") {
			while (current < position) {
				current ++;
			}
		}
		
		if (direct == "DOWN") {
			while (current > position) {
				current --;
			}
		}
		
		else {
			current = 1;
		}
		current = position;
		return current;
	}
	
}

