import java.util.Date;

public class Main {
	public static void output(Wrapper<?> w) throws InterruptedException {
		for(int i = 0; i < 5; i++) {
			try {
				Object obj = w.getTest();
				System.out.println(obj);
			} catch(RuntimeException e) {
				System.out.println("Error: " + e.getMessage());
			}
			Thread.sleep((long)(1000 + Math.random() * 1000));
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Wrapper<Integer> w = new Wrapper<>(123, 6);
		Wrapper<Date> w1 = new Wrapper<>(new Date(), 3);
		Wrapper<String> w2 = new Wrapper<>("Hello", 2);
		output(w);
		output(w1);
		output(w2);
	}
}
