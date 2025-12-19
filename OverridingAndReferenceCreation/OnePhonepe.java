package OverridingAndReferenceCreation;

public class OnePhonepe extends OnePayment {

	@Override
	void reward() {
		System.out.println("Get rward on Phonepe 10%");
	}

	@Override
	void checkBalance() {
		System.out.println("Check your Balance on Phonepe");
	}
}
