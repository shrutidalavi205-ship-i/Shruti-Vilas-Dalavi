package OverridingAndReferenceCreation;

public class FourMango extends FourFruit {

	@Override
	void name() {
		System.out.println("The Name of fruit is Mango");
	}

	@Override
	void colour() {
		System.out.println("The Colour og Mango is Yellow");
	}

	@Override
	void seed() {
		System.out.println("Seed is present in Mango");
	}
}
