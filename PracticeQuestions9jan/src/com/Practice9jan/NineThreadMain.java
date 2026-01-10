package com.Practice9jan;

public class NineThreadMain {

	public static void main(String[] args) {

		NineThread t = new NineThread();
		NineThread t1 = new NineThread();
		NineThread t2 = new NineThread();

		t.setName("Shruti");
		t1.setName("Vaishnavi");
		t2.setName("Ganesh");

		t.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.NORM_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);

		t.start();
		t1.start();
		t2.start();
	}
}
