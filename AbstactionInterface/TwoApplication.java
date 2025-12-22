package AbstactionInterface;

public class TwoApplication {

	public static void main(String[] args) {

		TwoGpay g;
		g = new TwoGpay();
		g.makePayment();
		System.out.println(" ");

		TwoPhonepe p;
		p = new TwoPhonepe();
		p.makePayment();
		System.out.println(" ");

		TwoPaytem m;
		m = new TwoPaytem();
		m.makePayment();

	}
}
