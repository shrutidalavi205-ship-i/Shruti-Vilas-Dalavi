package com.Practice9jan;

public class SevenInterfaceMain {

	public static void main(String[] args) {

		SevenInterfaceA a = new SevenInterfaceA();

		Thread t = new Thread(a);

		t.start();

	}
}
