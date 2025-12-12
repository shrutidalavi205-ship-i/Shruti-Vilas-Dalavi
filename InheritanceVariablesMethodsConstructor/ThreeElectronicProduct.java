package InheritanceVariablesMethodsConstructor;

public class ThreeElectronicProduct extends ThreeProduct {

	ThreeElectronicProduct() {
		super(32, "Laptop", 30.0);
	}

	void brand() {
		System.out.println("HP");
	}

	void warrantyPeriod() {
		System.out.println("3 years");
	}
}
