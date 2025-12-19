package OverridingAndReferenceCreation;

public class OneRazarpay extends OnePayment {

	@Override
	void reward() {
		System.out.println("Get reward on Razarpay 20%");
	}

	@Override
	void checkBalance() {
		System.out.println("Check your Balance on Razarpay");
	}
}
