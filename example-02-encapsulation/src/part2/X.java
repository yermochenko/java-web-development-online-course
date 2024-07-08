package part2;

public class X {
	private final boolean a;
	private final boolean b;
	private final boolean c;

	public X(boolean a, boolean b, boolean c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public /*final*/ boolean isA() {
		return a;
	}

	public /*final*/ boolean isB() {
		return b;
	}

	public /*final*/ boolean isC() {
		return c;
	}
}
