package PolymorphismOverloading;

public class Login {

	void login(String userName) {
		System.err.print("Print Name = ");
		System.out.println(userName);
	}

	void login(String userName, int password) {
		System.err.print("Print Username & Password = ");
		System.out.println(userName + " " + password);
	}

	public static void main(String[] args) {

		Login l = new Login();
		l.login("Shruti");
		l.login("Shruti", 1234);
	}
}
