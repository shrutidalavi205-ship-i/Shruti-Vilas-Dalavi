package InheritanceVariablesMethodsConstructor;

public class ThreeGroceryProduct extends ThreeProduct {

	ThreeGroceryProduct() {
		super(54, "Biscuit", 50.0);
	}

	void packDate() {
		System.out.println("13/05/2025");
	}

	void expiryDate() {
		System.out.println("31/06.2025");
	}

	public static void main(String[] args) {

		System.out.println("Electronics Product Details");
		ThreeElectronicProduct e = new ThreeElectronicProduct();
		e.viewDetails();
		e.brand();
		e.warrantyPeriod();

		System.out.println("  ");
		
		System.out.println("Grocery Product Details");
		ThreeGroceryProduct g = new ThreeGroceryProduct();
		g.viewDetails();
		g.packDate();
		g.expiryDate();
	}
}
