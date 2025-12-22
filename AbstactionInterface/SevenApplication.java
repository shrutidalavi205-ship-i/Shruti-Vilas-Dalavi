package AbstactionInterface;

public class SevenApplication {

	public static void main(String[] args) {

		SevenApple a;
		a = new SevenApple();
		System.out.println("Apple Details");
		a.name();
		a.quantity();
		System.out.println(" ");
		SevenMango m;
		m = new SevenMango();
		System.out.println("Mango Details");
		m.name();
		m.quantity();
	}

}
