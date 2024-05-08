public class B {
	private final boolean p;
	private final char q;
	private A a;

	public B(boolean p, char q) {
		this.p = p;
		this.q = q;
	}

	public boolean isP() {
		return p;
	}

	public char getQ() {
		return q;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
