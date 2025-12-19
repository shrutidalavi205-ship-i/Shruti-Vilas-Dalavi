package OverridingAndReferenceCreation;

public class EightLaptop extends EightDevice {

	@Override
	void name() {
		System.out.println("HP");
	}

	@Override
	void ram() {
		System.out.println("8 Gb");
	}
}
