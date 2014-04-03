package concurrent;

public class ConcurrentClass {
	private int counter = 0;

	public int getCounter() {
		return counter;
	}

	public void incrementCounter() {
		counter++;
		System.out.println("Incremented to: " + counter);
	}

}
