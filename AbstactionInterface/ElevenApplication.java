package AbstactionInterface;

public class ElevenApplication {

	public static void main(String[] args) {

		ElevenSamsung s;
		s = new ElevenSamsung();
		System.out.println("Samsung Information");
		s.name();
		s.price();
		System.out.println(" ");
		ElevenApple a;
		a = new ElevenApple();
		System.out.println("Apple Information");
		a.name();
		a.price();
	}
}
