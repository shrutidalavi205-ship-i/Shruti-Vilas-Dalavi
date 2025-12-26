package StaticKeyword;

public class TwoBank {

	static String rateofInterest = "5 %";
	String accBalance;

	public TwoBank(String accBalance) {
		this.accBalance = accBalance;
	}

	static void changeROI(String newROI) {
		rateofInterest = newROI;
		System.out.println("New Rate of Interest 10 %");
	}

	void display() {
		System.out.println("Account Balance: " + accBalance);
		System.out.println("Rate of Interest: " + rateofInterest + "%");
	}

	public static void main(String[] args) {

		TwoBank b = new TwoBank("50000");
		TwoBank b1 = new TwoBank("1000000");

		TwoBank.changeROI("10%");

		b.display();
		b.display();

	}

}
