package PolymorphismCombine;

public class TwoUser extends TwoLogin {

	@Override
	void n(String name) {
		System.out.println("Name is = " + name);
	}

	@Override
	void n(String name, int age) {
		System.out.println("Name and Age is = " + name + "  " + age);
	}

	public static void main(String[] args) {
		TwoLogin l = new TwoLogin();
		l.n("Shruti");
		l.n("Shruti", 21);

		TwoUser u = new TwoUser();
		u.n("Vaishnavi");
		u.n("Vaishnavi", 20);
	}
}
