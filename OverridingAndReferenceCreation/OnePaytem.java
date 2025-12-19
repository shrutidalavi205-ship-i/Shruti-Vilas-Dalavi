package OverridingAndReferenceCreation;

public class OnePaytem extends OnePayment {

	@Override
	void reward() {
		System.out.println("Get reward on Paytem 15 %");
	}

	@Override
	void checkBalance() {
		System.out.println("Check your Balance on Paytem");
	}
}
