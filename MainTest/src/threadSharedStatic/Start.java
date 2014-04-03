package threadSharedStatic;

import concurrent.StaticConcurrentClass;

public class Start {

	private static ThreadII thread;

	public static void main(String[] args) {
		thread = new ThreadII();

		thread.start();

		StaticConcurrentClass.incrementCounter();
		// use in ThreadI --> Thread Shared

	}

}
