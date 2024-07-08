package part2;

class Z extends X {
	private boolean a;
	private boolean b;
	private boolean c;

	public Z(boolean a, boolean b, boolean c) {
		super(a, b, c);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	private int counter = 0;
	@Override
	public boolean isA() {
		counter++;
		if(a && counter > 300) {
			a = false;
		}
		return a;
	}

	public void setA(boolean a) {
		this.a = a;
	}

	@Override
	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	@Override
	public boolean isC() {
		return c;
	}

	public void setC(boolean c) {
		this.c = c;
	}
}
