public class C {
	private Double abc;
	private Integer mnk;
	private final A a;

	public C(Double abc, Integer mnk, A a) {
		this.abc = abc;
		this.mnk = mnk;
		this.a = a;
	}

	public C(Integer mnk, A a) {
		this.mnk = mnk;
		this.a = a;
	}

	public C(Double abc, A a) {
		this.abc = abc;
		this.a = a;
	}

	public C(A a) {
		this.a = a;
	}

	public Double getAbc() {
		return abc;
	}

	public Integer getMnk() {
		return mnk;
	}

	public A getA() {
		return a;
	}
}
