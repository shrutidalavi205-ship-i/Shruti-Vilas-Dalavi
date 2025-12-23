package AbstractionAbstractClass;

public class OneCurrentAccount extends OneAccount {

	@Override
	void myA(String userName) {
		if (userName == "Shruti@gmail.com") {
			System.out.println("Your Current Account Open");
		} else {
			System.err.println("Wrong User Name");
		}

	}

	@Override
	void a() {
		System.out.println("Your Current Balance is 500000 ru");
	}
}