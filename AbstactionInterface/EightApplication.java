package AbstactionInterface;

public class EightApplication {

	public static void main(String[] args) {

		EightElectronic e;
		e = new EightElectronic();
		System.out.println("Electronics Product Details");
		e.name();
		e.price();
		System.out.println(" ");
		EightGrocery g;
		g = new EightGrocery();
		System.out.println("Grocery Product Details");
		g.name();
		g.price();
	}
}
