package com.Practice9jan;

public class SevenInterfaceA implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Thread is running: " + i);
			try {
				Thread.sleep(100); // pause for 1 second
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}
