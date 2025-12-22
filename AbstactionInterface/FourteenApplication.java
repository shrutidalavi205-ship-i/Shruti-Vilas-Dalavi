package AbstactionInterface;

public class FourteenApplication {

	public static void main(String[] args) {

		FourteenJPG j;
		j = new FourteenJPG();
		System.out.println("JPG Details");
		j.image();
		System.out.println(" ");
		FourteenPDF p;
		p = new FourteenPDF();
		System.out.println("PDF Details");
		p.image();
	}
}
