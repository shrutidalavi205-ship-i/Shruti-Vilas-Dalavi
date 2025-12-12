package InheritancePracticeQuestion;

public class ThirteenCat extends ThirteenAnimal {

	void myCat() {
		System.out.println("Cat");
	}

	public static void main(String[] args) {

		ThirteenDog d = new ThirteenDog();
		System.out.println("Dog Details");
		d.myAnimal();
		d.myDog();

		System.out.println(" ");
		System.out.println("Cat Details");
		ThirteenCat c = new ThirteenCat();
		c.myAnimal();
		c.myCat();
	}
}
