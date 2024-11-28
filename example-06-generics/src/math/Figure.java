package math;

abstract public class Figure {
	private final int x;
	private final int y;

	public Figure(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	abstract public double area();
}
