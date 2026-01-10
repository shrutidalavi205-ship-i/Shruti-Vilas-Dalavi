package com.Practice9jan;

public class OneArithmeticException {

	public static void main(String[] args) {

		System.out.println(4 / 2);
		System.out.println(6 / 2);
		System.out.println(5 / 2);
		try {
			System.out.println(4 / 0);

		} catch (ArithmeticException e) {
			System.out.println("Divided by zero is NOT Possible");
		} finally {
			System.out.println("I am Finally Block");
		}

		System.out.println(12 / 2);

	}
}
