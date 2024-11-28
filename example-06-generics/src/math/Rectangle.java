package math;

public class Rectangle extends Figure {
	private final int width;
	private final int height;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	@Override
	public double area() {
		return width * height;
	}
}
