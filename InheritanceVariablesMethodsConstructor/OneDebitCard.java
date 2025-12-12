package InheritanceVariablesMethodsConstructor;

public class OneDebitCard extends OneCard {

	OneDebitCard() {
		super("789436783489", "21/08/2023", "21/08/2027", "21/08/2028");
	}

	void accountBalance() {
		System.out.println("30 Lack Rupees");
	}

	void pin() {
		System.out.println("989350");
	}
}
