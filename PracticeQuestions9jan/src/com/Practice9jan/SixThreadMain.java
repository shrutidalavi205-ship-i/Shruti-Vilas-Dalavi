package com.Practice9jan;

public class SixThreadMain {

	public static void main(String[] args) {
		SixThread t = new SixThread();
		t.start();
		t.m1();
	}
}
