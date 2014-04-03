package threadSharedStatic;

import concurrent.StaticConcurrentClass;

public class ThreadII extends Thread {

	@Override
	public void run() {
		StaticConcurrentClass.incrementCounter(); // use in Thread II
	}

}
