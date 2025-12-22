package AbstactionInterface;

public class ThreeBike implements ThreeVehicle {

	@Override
	public void brand() {
		System.out.println("The Bike brand is Honda");
	}

	@Override
	public void name() {
		System.out.println("The Bike name is HF");
	}
}
