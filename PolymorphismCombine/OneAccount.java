package PolymorphismCombine;

public class OneAccount {

	void interest(double balance) {
		double interest;
		System.out.println(interest = balance * 0.03);
		System.out.println("Interest (3%) = " + interest);
	}

	void calculateInterest(double balance, int years) {
		double interest;
		System.out.println(interest = balance * 0.04 * years);
		System.out.println("Interest (4% for " + years + " years): " + interest);
	}

	void calculateInterest(double balance, int years, double rate) {
		double interest;
		System.out.println(interest = balance * rate * years);
		System.out.println("Account Interest (" + rate * 100 + "%): " + interest);
	}

}
