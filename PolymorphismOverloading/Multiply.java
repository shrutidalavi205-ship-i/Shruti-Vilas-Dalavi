package PolymorphismOverloading;

public class Multiply {

	void add(int a, int b) {
		System.err.print("Two Int = ");
		System.out.println(a * b);
	}

	void add(double a, double b) {
		System.err.print("Two Double = ");
		System.out.println(a * b);
	}

	public static void main(String[] args) {
		Multiply m = new Multiply();
		m.add(34, 56);
		m.add(456.56, 5654.677);
	}
}
