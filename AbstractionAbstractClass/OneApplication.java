package AbstractionAbstractClass;

public class OneApplication {

	public static void main(String[] args) {

		OneAccount a;
		a = new OneSavingAccount();
		System.err.println("Saving Account Details");
		a.a();
		a.myA("shruti@gmail.com");

		System.out.println(" ");
		a = new OneCurrentAccount();
		System.err.println("Current Account Details");
		a.a();
		a.myA("shruti@gmail.com");

	}
}
