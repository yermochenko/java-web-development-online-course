public class A {
	private final int x;
	private final double y;
	private B b;

	public A(int x, double y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
