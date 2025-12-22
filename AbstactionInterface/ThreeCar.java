package AbstactionInterface;

public class ThreeCar implements ThreeVehicle {

	@Override
	public void brand() {
		System.out.println("The Car brand is Luxrious");
	}

	@Override
	public void name() {
		System.out.println("The Car name is Oddy");
	}

}
