package AbstractionAbstractClass;

public class OneSavingAccount extends OneAccount {

	@Override
	void myA(String userName) {
		if (userName == "shruti@gmail.com") {
			System.out.println("Your Account Open");
		} else {
			System.err.println("Wrong User Name Please Check");
		}

	}

	@Override
	void a() {
		System.out.println("Your Saving Balance is 200000 ru");

	}

}
