package AbstactionInterface;

public class NineApplication {

	public static void main(String[] args) {

		NineLaptop l;
		l = new NineLaptop();
		System.out.println("Laptop Details");
		l.name();
		l.price();
		System.out.println(" ");
		NinePhone p;
		p = new NinePhone();
		System.out.println("Phone Details");
		p.name();
		p.price();

	}
}
