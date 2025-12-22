package AbstactionInterface;

public class SixteenApplication {

	public static void main(String[] args) {

		SixteenManager m;
		m = new SixteenManager();
		System.out.println("Manager Details");
		m.name();
		m.age();
		m.salary();
		System.out.println(" ");
		SixteenDevloper d;
		d = new SixteenDevloper();
		System.out.println("Devloper Details");
		d.name();
		d.age();
		d.salary();
	}
}
