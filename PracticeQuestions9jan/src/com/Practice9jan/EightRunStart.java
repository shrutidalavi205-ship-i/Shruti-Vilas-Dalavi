package com.Practice9jan;

public class EightRunStart extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Run = " + i);
		}

	}
}
