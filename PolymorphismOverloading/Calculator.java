package PolymorphismOverloading;

public class Calculator {

	void add(int a, int b) {
		System.err.print("Two Integers = ");
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.err.print("Three Integers = ");
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(34, 5);
		c.add(45, 6, 34);
	}
}
