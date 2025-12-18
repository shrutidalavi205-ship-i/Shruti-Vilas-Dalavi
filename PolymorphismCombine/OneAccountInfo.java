package PolymorphismCombine;

public class OneAccountInfo extends OneAccount {

	private double years;

	@Override
	void interest(double balance) {
		double interest = balance * 0.06 * years;
		System.out.println("SavingsAccount Interest (6% for " + years + " years): " + interest);

	}

	public static void main(String[] args) {

		OneAccount a = new OneAccount();
		a.interest(6576.7);
		a.calculateInterest(64564.75, 4);
		a.calculateInterest(746.87, 5, 6746.78);

		OneAccountInfo i = new OneAccountInfo();
		i.interest(3455.57);
	}
}
