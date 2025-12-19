package OverridingAndReferenceCreation;

public class FourGraps extends FourFruit {

	@Override
	void name() {
		System.out.println("The Name of the Fruit is Graps");
	}

	@Override
	void colour() {
		System.out.println("The colour of Graps is Green");
	}

	@Override
	void seed() {
		System.out.println("The seed is not present");
	}

	public static void main(String[] args) {

		FourFruit f;
		f = new FourMango();
		System.out.println("Mango Details...!");
		f.name();
		f.colour();
		f.seed();
		f = new FourGraps();
		System.out.println("Graps Details...!");
		f.name();
		f.colour();
		f.seed();

	}
}
