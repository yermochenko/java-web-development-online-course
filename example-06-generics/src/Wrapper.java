public class Wrapper<T> {
	private Object test;
	private final int max;
	private int counter;

	public Wrapper(T test, int max) {
		this.test = test;
		this.max = max;
	}

	@SuppressWarnings("unchecked")
	public T getTest() {
		counter++;
		System.out.println("DEBUG: Try to get object, counter = " + counter);
		if(counter > max) {
			test = null;
			throw new RuntimeException("Max number reached");
		}
		return (T) test;
	}
}
