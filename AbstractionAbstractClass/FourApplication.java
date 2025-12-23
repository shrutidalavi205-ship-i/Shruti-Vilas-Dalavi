package AbstractionAbstractClass;

public class FourApplication {

	public static void main(String[] args) {

		FourVehicle v;
		v = new FourCar();

		System.out.println("Car Details");

		v.brand();
		v.name();
		v.purpose();

		System.out.println(" ");

		v = new FourBike();

		System.out.println("Bike Details");

		v.brand();
		v.name();
		v.purpose();

	}
}
