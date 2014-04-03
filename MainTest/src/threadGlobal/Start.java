package threadGlobal;

import concurrent.ConcurrentClass;

public class Start {

	private static ThreadII thread;

	public static void main(String[] args) {
		ConcurrentClass a = new ConcurrentClass();

		thread = new ThreadII();
		thread.setA(a); // publish a --> a = Thread Global

		thread.start();

		a.incrementCounter(); // use in Thread I --> Thread Shared

	}

}
