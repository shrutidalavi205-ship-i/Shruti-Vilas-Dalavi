package AbstactionInterface;

public class ThreeApplication {

	public static void main(String[] args) {

		ThreeCar c;
		c = new ThreeCar();
		System.err.println("Car Details");
		c.brand();
		c.name();
		System.out.println(" ");
		ThreeBike b;
		b = new ThreeBike();
		System.err.println("Bike Details");
		b.brand();
		b.name();

	}
}
