package threadStackConfined;

import concurrent.ConcurrentClass;

public class ThreadII extends Thread {

	@Override
	public void run() {
		ConcurrentClass a = new ConcurrentClass();
		a.incrementCounter(); // use in Thread II
	}

}
