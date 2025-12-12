package InheritanceVariablesMethodsConstructor;

public class ThreeProduct {

	int productID;
	String name;
	double price;

	public ThreeProduct(int productID, String name, double price) {
		this.productID = productID;
		this.name = name;
		this.price = price;

	}

	void viewDetails() {
		System.err.println("Product ID = " + productID);
		System.err.println("Product Name = " + name);
		System.err.println("Product Price = " + price);

	}
}
