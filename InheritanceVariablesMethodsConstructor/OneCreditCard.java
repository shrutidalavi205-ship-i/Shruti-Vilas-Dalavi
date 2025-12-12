package InheritanceVariablesMethodsConstructor;

public class OneCreditCard extends OneCard {

	OneCreditCard() {
		super("568674", "21/08/2020", "21/03/7685", "21/08/7886");
	}

	void creditLimit() {
		System.out.println("20 Thounsand Per Day");
	}

	void currentBalance() {
		System.out.println("50 Lack");
	}

	void interestRate() {
		System.out.println("5%");
	}

	public static void main(String[] args) {
		System.out.println("Debit Card Details");
		OneDebitCard d = new OneDebitCard();
		d.viewDetails();
		d.accountBalance();
		d.pin();

		System.out.println("__________________________");
		System.out.println("Credit Card Details");
		OneCreditCard c = new OneCreditCard();
		c.viewDetails();
		c.creditLimit();
		c.currentBalance();
		c.interestRate();
	}

}
