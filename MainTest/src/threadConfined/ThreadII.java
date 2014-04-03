package threadConfined;

import concurrent.ConcurrentClass;

public class ThreadII extends Thread {
	private ConcurrentClass a;

	@Override
	public void run() {
		a = new ConcurrentClass();
		a.incrementCounter(); // use in Thread II
	}

	public void setA(ConcurrentClass a) {
		this.a = a;
	}

}
