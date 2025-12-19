package OverridingAndReferenceCreation;

public class OneGpay extends OnePayment {

	@Override
	void reward() {
		System.out.println("Get Reward on Gpay 5 %");
	}

	@Override
	void checkBalance() {
		System.out.println("Check Your Balance on Gpay");
	}
}
