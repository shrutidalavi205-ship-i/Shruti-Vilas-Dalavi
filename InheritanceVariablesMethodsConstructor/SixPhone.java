package InheritanceVariablesMethodsConstructor;

public class SixPhone extends SixDevice {

	SixPhone() {
		super("Phone", 45.0, "7GB");
	}

	void name2() {
		System.out.println("Samsung");
	}

	public static void main(String[] args) {
		System.out.println("Laptop Details");
		SixLaptop l = new SixLaptop();
		l.viewDetails();
		l.name1();

		System.out.println(" ");
		System.out.println("Phone Details");
		SixPhone p = new SixPhone();
		p.viewDetails();
		p.name2();
	}
}
