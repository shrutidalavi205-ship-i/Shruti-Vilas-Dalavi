package OverridingAndReferenceCreation;

public class TenCircle extends TenShape {

	@Override
	void name() {
		System.out.println("Circle");
	}

	@Override
	void egdes() {
		System.out.println("No egdes");
	}
}
