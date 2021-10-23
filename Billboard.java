/**
 * Billboard
 * Creates a Billboard containing a message to be printed to the console.
 * @author Cordell Bonnieux
 *
 */
public class Billboard implements ConsoleDrawable {
	private String message;
	
	/**
	 * Class Constructor
	 * @param m String - a message to be displayed on the "Billboard"
	 */
	public Billboard(String m) {
		if (m == null) {
			throw new NullPointerException("Message cannot be null.");
		} else if (m.contains("\n")) {
			throw new IllegalArgumentException("Message can only constain one line.");
		}
		this.message = m;
	}
	
	/**
	 * Set Message
	 * @param m String - a valid one line string
	 */
	public void setMessage(String m) {
		if (m == null) {
			throw new NullPointerException("Message cannot be null.");
		} else if (m.contains("\n")) {
			throw new IllegalArgumentException("Message can only constain one line.");
		}
		this.message = m;
	}
	
	/**
	 * Get Message
	 * @return String - the current message 
	 */
	public String getMessage() {
		return this.message;
	}
	
	/**
	 * Draw For Console
	 * Draws a rectangular billboard to the console containing the instance's message
	 * @return output String - An ASCII character "Billboard" containing the message
	 */
	@Override
	public String drawForConsole() {
		String output = "";
		int length = this.getMessage().length() + 4;
		for (int y = 0; y < 5; y++) {
			for (int x = 0; x < length; x++) {
				if (y == 0 || y == 4) {
					output += "#";
				} else if (x == 0 || x == length - 1) {
					output += "#";
				} else if (x > 1 && x < length - 2 && y == 2) {
					int pos = x - 2;
					output += "" + this.getMessage().charAt(pos);
				} else {
					output += " ";
				}
				
				if (x == length - 1) {
					output += "\n";
				}
			}
		}
		return output;
	}
	
	@Override
	public String toString() {
		return new String();
	}
}