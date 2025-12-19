package OverridingAndReferenceCreation;

public class SevenLily extends SevenFlower {

	@Override
	void name() {
		System.out.println("The Name of Flower is Lily");
	}

	@Override
	void colour() {
		System.out.println("Colour of Lily is Purple");
	}
}
