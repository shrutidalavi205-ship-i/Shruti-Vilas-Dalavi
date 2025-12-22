package AbstactionInterface;

public class EighteenApplication {

	public static void main(String[] args) {

		EighteenOLD o;
		o = new EighteenOLD();
		System.out.println("OLD TV Details");
		o.name();
		o.price();
		System.out.println(" ");
		EighteenNEW n;
		n = new EighteenNEW();
		System.out.println("NEW TV Details");
		n.name();
		n.price();
	}
}
