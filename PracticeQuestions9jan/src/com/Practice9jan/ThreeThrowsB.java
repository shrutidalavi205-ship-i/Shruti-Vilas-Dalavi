package com.Practice9jan;

public class ThreeThrowsB {

	public void m2() {

		ThreeThrowsA a = new ThreeThrowsA();
		try {
			a.m1();
		} catch (ArithmeticException e) {
			System.out.println("Divided by Zero is NOT Posible");
		}
	}
}
