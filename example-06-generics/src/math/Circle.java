package math;

public class Circle extends Figure {
	private final int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
}
