package InheritanceVariablesMethodsConstructor;

public class FourBike extends FourVehical {

	FourBike() {
		super("Yama", 5467, "2");
	}

	void name2() {
		System.out.println("R15");
	}

	public static void main(String[] args) {

		System.out.println("Car Details");
		FourCar c = new FourCar();
		c.viewDetails();
		c.name1();
		System.out.println(" ");
		System.out.println("Bike Details");
		FourBike b = new FourBike();
		b.viewDetails();
		b.name2();
	}
}
