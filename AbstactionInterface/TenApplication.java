package AbstactionInterface;

public class TenApplication {

	public static void main(String[] args) {

		TenHP h;
		h = new TenHP();
		System.out.println("HP Details");
		h.brand();
		h.ram();
		h.price();
		System.out.println(" ");
		TenASUS a;
		a = new TenASUS();
		System.out.println("ASUS Details");
		a.brand();
		a.ram();
		a.price();
	}
}
