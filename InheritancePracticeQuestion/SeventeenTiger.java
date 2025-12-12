package InheritancePracticeQuestion;

public class SeventeenTiger extends SeventeenCat {

	void myName4() {
		System.out.println("Tiger");
	}

	public static void main(String[] args) {
		System.out.println("Dog Details");
		SeventeenDog d = new SeventeenDog();
		d.myName();
		d.myName1();

		System.out.println(" ");
		System.out.println("Cat Details");
		SeventeenCat c = new SeventeenCat();
		c.myName();
		c.myName3();

		System.out.println("  ");
		System.out.println("Tiger Details");
		SeventeenTiger t = new SeventeenTiger();
		t.myName();
		t.myName3();
		t.myName4();
	}
}
