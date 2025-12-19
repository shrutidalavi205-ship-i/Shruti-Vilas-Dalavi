package OverridingAndReferenceCreation;

public class TwoBike extends TwoVehicle {

	@Override
	void name() {
		System.out.println("The Bike Name");
	}

	@Override
	void brand() {
		System.out.println("The Brand of Bike");
	}

	@Override
	void releasedDate() {
		System.out.println("21/08/2025");
	}

	public static void main(String[] args) {

		TwoVehicle v;
		v = new TwoCar();
		System.out.println("The Car Detailes ...!");
		v.name();
		v.brand();
		v.releasedDate();
		System.out.println(" ");
		v = new TwoBike();
		System.out.println("The Bike Detailes ...!");
		v.name();
		v.brand();
		v.releasedDate();
	}
}
