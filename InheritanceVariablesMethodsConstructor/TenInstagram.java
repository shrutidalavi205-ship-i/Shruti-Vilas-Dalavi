package InheritanceVariablesMethodsConstructor;

public class TenInstagram extends TenUser {

	public TenInstagram() {
		super("Instagram", "eufyr487", "ifu45");
	}

	void following() {
		System.out.println("7685");
	}

	void followers() {
		System.out.println("56478");
	}

	public static void main(String[] args) {
		System.out.println("Whatsapp Details");
		TenWhatsapp w = new TenWhatsapp();
		w.viewDetails();
		w.status();

		System.out.println(" ");
		System.out.println("Instagram Details");
		TenInstagram i = new TenInstagram();
		i.viewDetails();
		i.following();
		i.followers();
	}
}
