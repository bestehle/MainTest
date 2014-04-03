package threadShared;

import concurrent.ConcurrentClass;
import concurrent.StaticConcurrentClass;

public class ThreadII extends Thread {
	private ConcurrentClass a;

	@Override
	public void run() {
		a.incrementCounter(); // use in Thread II
		StaticConcurrentClass.incrementCounter();
	}

	public void setA(ConcurrentClass a) {
		this.a = a;
	}

}
