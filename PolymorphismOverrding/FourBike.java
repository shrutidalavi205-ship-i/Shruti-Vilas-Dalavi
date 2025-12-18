package PolymorphismOverrding;

public class FourBike extends FourVehicle {

	@Override
	void name() {
		System.out.println("Bike Name");
	}

	void model() {
		System.out.println("3455");
	}

	public static void main(String[] args) {

		FourVehicle v = new FourVehicle();
		v.name();
		FourBike b = new FourBike();
		b.name();
		b.model();
	}
}
