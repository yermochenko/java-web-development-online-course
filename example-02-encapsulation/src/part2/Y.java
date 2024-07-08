package part2;

public class Y {
	static int dosmth(X x) {
		int count = 0;
		for(int i = 0; i < 1000; i++) {
			if(x.isA()) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		X x1 = new X(true, false, true);
		System.out.println(dosmth(x1));
		X x2 = new X(false, false, true);
		System.out.println(dosmth(x2));
		Z z = new Z(true, true, true);
		System.out.println(dosmth(z));
	}
}
