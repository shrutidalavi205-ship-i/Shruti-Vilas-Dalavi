package AbstactionInterface;

public class TwoPaytem implements TwoUPI {

	@Override
	public void makePayment() {
		System.out.println("I am from Paytem");
	}
}
