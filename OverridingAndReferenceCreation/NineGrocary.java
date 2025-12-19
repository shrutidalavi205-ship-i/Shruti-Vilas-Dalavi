package OverridingAndReferenceCreation;

public class NineGrocary extends NineProduct {

	@Override
	void name() {
		System.out.println("Name of the Grocary Product");
	}

	@Override
	void warranty() {
		System.out.println("Warranty of the Grocary Product");
	}

	public static void main(String[] args) {

		NineProduct p;
		p = new NineElectronic();
		System.out.println("Electronic Product Details");
		p.name();
		p.warranty();
		System.out.println(" ");
		p = new NineGrocary();
		System.out.println("Grocary Product Details");
		p.name();
		p.warranty();
	}
}
