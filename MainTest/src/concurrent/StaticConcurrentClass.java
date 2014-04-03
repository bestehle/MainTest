package concurrent;

public class StaticConcurrentClass {
	private static int counter = 0;
	public static Object obj;

	public static int getCounter() {
		return counter;
	}

	public static void incrementCounter() {
		counter++;
		System.out.println("Incremented to: " + counter);
	}

}
