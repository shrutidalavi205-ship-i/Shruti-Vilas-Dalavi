package InheritanceVariablesMethodsConstructor;

public class SixDevice {

	String name;
	double price;
	String ram;

	public SixDevice(String name, double price, String ram) {
		this.name = name;
		this.price = price;
		this.ram = ram;
	}

	void viewDetails() {
		System.err.println("Name = " + name);
		System.err.println("Price = " + price);
		System.err.println("RAM = " + ram);

	}
}
