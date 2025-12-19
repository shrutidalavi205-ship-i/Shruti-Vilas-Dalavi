package OverridingAndReferenceCreation;

public class TwoCar extends TwoVehicle {

	@Override
	void name() {
		System.out.println("The Car");
	}

	@Override
	void brand() {
		System.out.println("The Brand of Car");
	}

	@Override
	void releasedDate() {
		System.out.println("The Date 21/08/2005");
	}
}
