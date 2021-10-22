
public class ConsoleRectangle extends ConsoleShape {
	private int height;
	private int width;
	
	public ConsoleRectangle(int h, int w, boolean filled) {
		super(filled);
		if (h < 1 || w < 1) {
			throw new IllegalArgumentException("Both parameters must be natural numbers.");
		}
		this.height = h;
		this.width = w;
	}
	
	public ConsoleRectangle(int h, int w) {
		this(h, w, true);
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public void setHeight(int h) {
		if (h < 1) {
			throw new IllegalArgumentException("Parameter must be a natural number.");
		}
		this.height = h;
	}
	
	public void setWidth(int w) {
		if (w < 1) {
			throw new IllegalArgumentException("Parameter must be a natural number.");
		}
		this.width = w;
	}
	
	@Override
	public int getArea() {
		return this.height * this.width;
	}
	
	@Override
	public int getPerimeter() {
		return 2 * (this.height + this.width);
	}
}
