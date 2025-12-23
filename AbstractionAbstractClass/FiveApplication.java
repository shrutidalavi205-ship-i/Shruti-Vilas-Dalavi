package AbstractionAbstractClass;

public class FiveApplication {

	public static void main(String[] args) {

		FiveFruit f;
		f = new FiveMango();

		System.out.println("Mando Details");

		f.name();
		f.weight();
		f.purpose();

		System.out.println(" ");

		f = new FiveGrapes();

		System.out.println("Grapes Details");

		f.name();
		f.weight();
		f.purpose();
	}
}
