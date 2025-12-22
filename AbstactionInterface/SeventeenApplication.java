package AbstactionInterface;

public class SeventeenApplication {

	public static void main(String[] args) {

		SeventeenCricket c;
		c = new SeventeenCricket();
		System.out.println("Cricket Details");
		c.playerQuantity();
		c.playerTypes();
		System.out.println(" ");
		SeventeenKabaddi k;
		k = new SeventeenKabaddi();
		System.out.println("Kabaddi Details");
		k.playerQuantity();
		k.playerTypes();
	}
}
