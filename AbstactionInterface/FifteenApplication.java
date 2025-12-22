package AbstactionInterface;

public class FifteenApplication {

	public static void main(String[] args) {
		FifteenDog d;
		d = new FifteenDog();
		System.out.println("Dog Details");
		d.name();
		d.age();
		System.out.println(" ");
		FifteenCat c;
		c = new FifteenCat();
		System.out.println("Cat Details");
		c.name();
		c.age();
	}
}
