/**
 * Console Shape
 * Abstract class used to create classes that instantiate shapes, which can be filled or empty.
 * @author Cordell Bonnieux
 *
 */
public abstract class ConsoleShape implements Comparable<ConsoleShape> {
	private boolean filledIn;
	
	/**
	 * Class Constructor
	 * @param filled boolean - is filled in?
	 */
	public ConsoleShape(boolean filled) {
		this.filledIn = filled;
	}
	
	/**
	 * Class Constructor
	 * Filled in is set to true
	 */
	public ConsoleShape() {
		this(true);
	}
	
	/**
	 * Is Filled In?
	 * Getter for boolean data member filledIn
	 * @return boolean value - is the shape filled in?
	 */
	public boolean isFilledIn() {
		return this.filledIn;
	}
	
	/**
	 * Set Filled In
	 * Setter used to declare whether a shape is filled in or not
	 * @param filled boolean - true for filled, false for not filled
	 */
	public void setFilledIn(boolean filled) {
		this.filledIn = filled;
	}
	
	/**
	 * Get Area
	 * Sub-classes use to return shape area
	 * @return double - area of shape
	 */
	public abstract int getArea();
	
	/**
	 * Get Perimeter
	 * Sub-classes use to return shape perimeter
	 * @return double - perimeter of shape
	 */
	public abstract int getPerimeter();
	
	/**
	 * Compare To
	 * Overrides compareTo() method to compare two ConsoleShape objects by area
	 * @param that ConsoleShape - object to compare with this
	 * @return int - positive if this > that, negative if this < that, and zero if they are equal
	 */
	@Override
	public int compareTo(ConsoleShape that) {
		return Integer.compare(this.getArea(), that.getArea());
	}
	
	@Override
	public String toString() {
		String info = "*** Console Shape Object *** \nFilled In: " + this.filledIn;
		info += "\nArea: " + this.getArea() + "\nPerimeter: " + this.getPerimeter();
		return info;
	}
}
