
public abstract class ConsoleShape {
	private boolean filledIn;
	
	public ConsoleShape(boolean filled) {
		this.filledIn = filled;
	}
	
	public ConsoleShape() {
		this(true);
	}
	
	public boolean isFilledIn() {
		return this.filledIn;
	}
	
	public void setFilledIn(boolean filled) {
		this.filledIn = filled;
	}
	
	public abstract double getArea();
	
	public abstract double getPerimeter();
	
	@Override
	public String toString() {
		return new String("*** Console Shape Object *** \nFilled In: " + this.filledIn);
	}
}
