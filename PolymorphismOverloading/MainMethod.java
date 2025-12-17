package PolymorphismOverloading;

public class MainMethod {

	public static void main(String meassege) {
		System.out.println("Main Method");
		System.out.println(meassege);
	}

	public static void main(String meassage, String fName) {
		System.err.print("Meaasege + First Name = ");
		System.out.println(meassage + " " + fName);
	}

	public static void main(String meassage, String fName, String lName) {
		System.err.print("Meaasege + First Name + Last Name = ");
		System.out.println(meassage + " " + fName + " " + lName);
	}

	public static void main(String meassage, String fName, String lName, int a, int b) {
		System.err.print("Meaasege + First Name + Last Name + a + b = ");
		System.out.println(meassage + " " + fName + " " + lName + " " + a + " " + b);
		System.out.print(a - b);
	}

	public static void main(String meassage, String fName, String lName, int a, int b, int c, int d) {
		System.err.print("Meassage + First Name + Last Name + a + b + c + d = ");
		System.out.print(meassage + " " + fName + " " + lName + " " + a + " " + b + " " + c + " " + d);
		System.out.println(c - d);
	}

	public static void main(String[] args) {
		MainMethod m = new MainMethod();
		m.main("Java Program");
		m.main("Java Program", "Shruti");
		m.main("Java Program", "Shruti", "Dalavi");
		m.main("Java Program", "Shruti", "Dalavi", 34, 56);
		m.main("Java Program", "Shruti", "Dalavi", 45, 67, 89, 76);
	}
}
