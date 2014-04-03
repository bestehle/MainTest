package threadStackConfined;

import concurrent.ConcurrentClass;

public class Start {

	private static ThreadII thread;

	public static void main(String[] args) {

		thread = new ThreadII();
		thread.start();

		ConcurrentClass a = new ConcurrentClass();
		a.incrementCounter();

	}

}
