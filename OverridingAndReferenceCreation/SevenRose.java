package OverridingAndReferenceCreation;

public class SevenRose extends SevenFlower {

	@Override
	void name() {
		System.out.println("The name of the flower is Rose");
	}

	@Override
	void colour() {
		System.out.println("The colour of Rose is Red");
	}

	public static void main(String[] args) {

		SevenFlower f;
		f = new SevenLily();
		System.out.println("Lily Details");
		f.name();
		f.colour();
		System.out.println(" ");
		f = new SevenRose();
		System.out.println("Rose Details");
		f.name();
		f.colour();
	}
}
