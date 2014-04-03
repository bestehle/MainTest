package threadShared;

import concurrent.ConcurrentClass;
import concurrent.StaticConcurrentClass;

public class MainThread {

	private static ThreadII thread;

	public static void main(String[] args) {
		ConcurrentClass a = new ConcurrentClass();

		thread = new ThreadII();
		thread.setA(a); // publish a --> a = Thread Global
		thread.start();

		StaticConcurrentClass.incrementCounter();
		StaticConcurrentClass.obj = new Object();

		a.incrementCounter(); // use in Thread I --> Thread Shared

	}

}
