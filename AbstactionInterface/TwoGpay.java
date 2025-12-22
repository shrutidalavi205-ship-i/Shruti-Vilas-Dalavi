package AbstactionInterface;

public class TwoGpay implements TwoUPI {

	@Override
	public void makePayment() {
		System.out.println("I am from Gpay");
	}

}
