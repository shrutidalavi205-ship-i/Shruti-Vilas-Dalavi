package AbstactionInterface;

public class FiveApplication {

	public static void main(String[] args) {

		FiveWhatsapp w;
		w = new FiveWhatsapp();
		System.err.println("Whatsapp Details");
		w.login();
		w.name();
		System.out.println(" ");
		FiveInstagram i;
		i = new FiveInstagram();
		i.login();
		i.name();
		System.err.println("Instagram Details");

	}
}
