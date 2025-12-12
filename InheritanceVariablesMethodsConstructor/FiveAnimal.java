package InheritanceVariablesMethodsConstructor;

public class FiveAnimal {

	String name;
	int legs;

	public FiveAnimal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	void viewDetails() {
		System.err.println("Name = " + name);
		System.err.println("Legs = " + legs);
	}

}
