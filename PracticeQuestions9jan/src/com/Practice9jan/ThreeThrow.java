package com.Practice9jan;

public class ThreeThrow {

	public static void main(String[] args) {

		int age = 21;

		if (age < 18) {
			throw new ArithmeticException("Not Eligible to Vote");
		} else {
			System.out.println("Eligible to vote");
		}

	}
}
