
  public class Drive {
	
	private int pos;
	private String direct;
	int current = 1;
	
	/* The method setMovement stores a value in the fields
	 * direct and pos.
	 * @param d and p The values to store in the direct and pos fields.
	 */
	public void setMovement(int p, String d) {
		direct = d;
		pos = p;
	}
	
	/* The method getMovement returns a Drive object's
	 * pos.
	 * @return The value in the pos field.
	 * 
	 */
	
	public int getMovement() {
		return pos;
		
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
	 * pos after changing current to the new position.
	 * @return The value in the pos field.
	 * 
	 */
	
	public int calculateMovement() {
		if (direct == "UP") {
			while (current < pos) {
				current ++;
			}
		}
		
		if (direct == "DOWN") {
			while (current > pos) {
				current --;
			}
		}
		
		else {
			current = 1;
		}
		current = pos;
		return current;
	}
	
}

