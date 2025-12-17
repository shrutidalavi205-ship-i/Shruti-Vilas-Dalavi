package PolymorphismOverloading;

public class Return {

	int add(int a, int b) {
		return a + b;
	}

	double add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {

		Return r = new Return();
		System.out.println(r.add(20, 40));
		System.out.println(r.add(34, 55, 65));

	}
}
