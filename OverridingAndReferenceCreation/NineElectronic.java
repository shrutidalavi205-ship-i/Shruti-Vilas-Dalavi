package OverridingAndReferenceCreation;

public class NineElectronic extends NineProduct {

	@Override
	void name() {
		System.out.println("Name of the Electronic Product");
	}

	@Override
	void warranty() {
		System.out.println("Warranty of Electronic Product");
	}
}
