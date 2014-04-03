package threadGlobal;

import concurrent.ConcurrentClass;

public class ThreadII extends Thread {
	private ConcurrentClass a;

	@Override
	public void run() { // Global, aber nicht benutzt -> Confined
	}

	public void setA(ConcurrentClass a) {
		this.a = a;
	}

}
