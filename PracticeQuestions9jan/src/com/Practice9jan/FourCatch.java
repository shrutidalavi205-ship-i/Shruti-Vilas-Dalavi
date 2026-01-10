package com.Practice9jan;

public class FourCatch {

	public static void main(String[] args) {

		System.out.println(10 / 4);
		System.out.println(20 / 4);
		System.out.println(200 / 40);

		try {
			System.out.println(2 / 0);
			System.out.println(20 / 0);

		} catch (ArithmeticException e) {
			System.err.println("Divided by Zero is NOT Posible");
		} finally {
			System.out.println("I am Finally Block");
		}
		System.out.println(67 / 1);
		System.out.println(200 / 40);

	}
}
