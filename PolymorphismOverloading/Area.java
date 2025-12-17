package PolymorphismOverloading;

public class Area {

	void area(double pi, double r, double r2) {
		System.err.print("Area of Circle = ");
		System.out.println(pi * r * r2);
	}

	void rectangle(int l, int w) {
		System.err.print("Area of Rectangle = ");
		System.out.println(l * w);
	}

	public static void main(String[] args) {

		Area a = new Area();
		a.area(34.56, 56.5, 67.4);
		a.rectangle(34, 56);
	}
}
