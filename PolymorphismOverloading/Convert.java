package PolymorphismOverloading;

public class Convert {

	void convert(float a) {
		System.err.println("The temprature is convered into Celcius to Fahreheit");
		System.out.println(a);
		System.out.println((a * 9 / 5) + 32);
	}

	void convert(float a, float b) {
		System.err.println("The temprature is convered into Fahreheit to Celcius");
		System.out.println(b);
		System.out.println((b - 32) * 5 / 9);
	}

	public static void main(String[] args) {

		Convert c = new Convert();
		c.convert(34);
		c.convert(45, 65);
	}
}
