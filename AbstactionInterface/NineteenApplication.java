package AbstactionInterface;

public class NineteenApplication {

	public static void main(String[] args) {

		NineteenJava j;
		j = new NineteenJava();
		System.out.println("Java Details");
		j.name();
		j.fee();
		System.out.println(" ");
		NineteenPython p;
		p = new NineteenPython();
		System.out.println("Python Details");
		p.name();
		p.fee();
	}
}
