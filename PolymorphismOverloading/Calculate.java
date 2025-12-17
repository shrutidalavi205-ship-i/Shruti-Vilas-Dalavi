package PolymorphismOverloading;

public class Calculate {

	void calculate(int a) {
		System.err.print("Square of a number = ");
		System.out.print(a + " " + "Square is ");
		System.out.println(a * a);
	}

	void calculate(int b, String name) {
		System.err.print("Cube of a number = ");
		System.out.print(b + " " + "Cube is ");
		System.out.println(b * b * b);
	}

	public static void main(String[] args) {
		Calculate c = new Calculate();
		c.calculate(5);
		c.calculate(2, "Java Programming Batch 1299");
	}
}
