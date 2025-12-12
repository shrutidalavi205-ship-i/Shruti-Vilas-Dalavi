package InheritanceVariablesMethodsConstructor;

public class SevenTicket {

	String name;
	int quantity;

	public SevenTicket(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;

	}

	void viewDetails() {
		System.err.println("Name = " + name);
		System.err.println("Quantity = " + quantity);
	}
}
