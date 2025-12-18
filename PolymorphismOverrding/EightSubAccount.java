package PolymorphismOverrding;

public class EightSubAccount extends EightAccount {

	@Override
	void which() {
		System.out.println("Saving Account");
	}

	void saving() {
		System.out.println("This is the Saving Account");
	}

	public static void main(String[] args) {

		EightAccount a = new EightAccount();
		a.which();
		EightSubAccount s = new EightSubAccount();
		s.which();
		s.saving();

	}
}
