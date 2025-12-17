package PolymorphismOverloading;

public class Maximun {

	void max(int a, int b) {
		System.err.println("Find maximum of Two Numbers");
//		 System.out.println("The maximum number is = ");
//		System.out.println(" ");

		if (a > b) {
			System.out.println("The maximum number is = " + a);
		} else {
			System.out.println("The maximum number is = " + b);
		}
	}

	void max(int a, int b, int c) {
		System.err.println("Find maximum of Two Numbers");
//		System.out.println("The maximum number is = ");

		if (a > b && a > c) {
			System.out.println("The maximun number is = " + a);
		} else if (b > c) {
			System.out.println("The maximum number is = " + b);
		} else {
			System.out.println("The maximum number is = " + c);
		}
	}

	public static void main(String[] args) {
		Maximun m = new Maximun();
		m.max(23, 45);
		m.max(23, 67, 98);
	}
}
