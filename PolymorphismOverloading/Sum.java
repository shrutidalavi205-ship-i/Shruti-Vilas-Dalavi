package PolymorphismOverloading;

public class Sum {

	void sum(int a, int b) {
		System.err.print("Integer Values = ");
		System.out.println(a + b);
	}

	void sum(float a, float b) {
		System.err.print("Float Values = ");
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		Sum s = new Sum();
		s.sum(23, 56);
		s.sum(34.76f, 67.87f);
	}
}
