package PolymorphismOverloading;

public class Display {

	void display(int a) {
		System.err.print("Integer Value = ");
		System.out.println(a);
	}

	void display(String name) {
		System.err.print("String Value = ");
		System.out.println(name);
	}

	public static void main(String[] args) {

		Display d = new Display();
		d.display(34);
		d.display("Shruti");
	}
}
