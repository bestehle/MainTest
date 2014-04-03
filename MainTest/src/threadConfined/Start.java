package threadConfined;

import concurrent.ConcurrentClass;

public class Start {

	private static ThreadII thread;

	public static void main(String[] args) {
		ConcurrentClass a = new ConcurrentClass();

		thread = new ThreadII();

		thread.start();

		a.incrementCounter();

	}

}
