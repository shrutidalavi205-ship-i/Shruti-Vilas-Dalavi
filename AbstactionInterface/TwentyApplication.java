package AbstactionInterface;

public class TwentyApplication {

	public static void main(String[] args) {

		TwentyBGM b;
		b = new TwentyBGM();
		System.out.println("BGM Details");
		b.focus();
		b.usedIn();
		System.out.println(" ");
		TwentyShastriya s;
		s = new TwentyShastriya();
		System.out.println("Shastriya Details");
		s.focus();
		s.usedIn();
	}
}
