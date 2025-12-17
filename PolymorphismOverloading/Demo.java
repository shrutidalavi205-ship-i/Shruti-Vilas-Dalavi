package PolymorphismOverloading;

public class Demo {

	void n(int a, String name) {
		System.err.print("Showing int and String = ");
		System.out.println(a + " " + name);
	}

	void n(String name, int a) {
		System.err.print("Showing String and int = ");
		System.out.println(name + " " + a);
	}

	public static void main(String[] args) {

		Demo d = new Demo();
		d.n(12, "Shruti");
		d.n("Vaishnavi", 21);
	}
}
