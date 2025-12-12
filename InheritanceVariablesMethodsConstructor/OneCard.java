package InheritanceVariablesMethodsConstructor;

public class OneCard {

	String cardNumber;
	String openDate;
	String expiryDate;
	String reNewDate;

	public OneCard(String cardNumber, String openDate, String expiryDate, String reNewDate) {
		this.cardNumber = cardNumber;
		this.openDate = openDate;
		this.expiryDate = expiryDate;
		this.reNewDate = reNewDate;
	}

	void viewDetails() {
		System.err.println("Card Number = " + cardNumber);
		System.err.println("Card Open Date = " + openDate);
		System.err.println("Card Expiry Date = " + expiryDate);
		System.err.println("Card Renew Date = " + reNewDate);

	}
}
