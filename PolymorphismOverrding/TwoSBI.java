package PolymorphismOverrding;

public class TwoSBI extends TwoBank {

	@Override
	void name() {
		System.out.println("SBI");
	}

	void roi() {
		System.out.println("Rate of Interest of SBI Bank is 5%");
	}

	public static void main(String[] args) {

		TwoBank b = new TwoBank();
		b.name();
		TwoSBI s = new TwoSBI();
		s.name();
		s.roi();
	}
}
