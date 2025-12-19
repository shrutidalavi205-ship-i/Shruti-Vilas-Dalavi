package OverridingAndReferenceCreation;

public class TenTriangle extends TenShape {

	@Override
	void name() {
		System.out.println("Triangle");
	}

	@Override
	void egdes() {
		System.out.println("Three");
	}

	public static void main(String[] args) {

		TenShape s;
		s = new TenCircle();
		System.out.println("Circle Details");
		s.name();
		s.egdes();
		System.out.println(" ");
		s = new TenTriangle();
		System.out.println("Triangle Details");
		s.name();
		s.egdes();
	}
}
