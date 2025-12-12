package InheritanceVariablesMethodsConstructor;

public class FourVehical {

	String name;
	int num;
	String seats;

	public FourVehical(String name, int num, String seats) {
		this.name = name;
		this.num = num;
		this.seats = seats;

	}

	void viewDetails() {
		System.err.println("Name = " + name);
		System.err.println("Num = " + num);
		System.err.println("Seats" + seats);

	}
}
