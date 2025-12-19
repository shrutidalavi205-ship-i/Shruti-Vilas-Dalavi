package OverridingAndReferenceCreation;

public class ThreeCurrent extends ThreeAccount {

	@Override
	void roi() {
		System.out.println("Rate of Interest 15%");
	}

	@Override
	void balance() {
		System.out.println("Your Current Balance is 200000 Ru");
	}

	public static void main(String[] args) {

		ThreeAccount a;
		a = new ThreeSaving();
		System.out.println("Saving Account Details...!");
		a.roi();
		a.balance();

		a = new ThreeCurrent();
		System.out.println("Current Account Details...!");
		a.roi();
		a.balance();
	}
}
