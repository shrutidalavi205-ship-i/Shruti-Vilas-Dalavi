package OverridingAndReferenceCreation;

public class OneApplication {

	public static void main(String[] args) {

		OnePayment p;
		p = new OneGpay();
		p.reward();
		p.checkBalance();

		p = new OnePhonepe();
		p.reward();
		p.checkBalance();

		p = new OnePaytem();
		p.reward();
		p.checkBalance();

		p = new OneRazarpay();
		p.reward();
		p.checkBalance();

	}
}
