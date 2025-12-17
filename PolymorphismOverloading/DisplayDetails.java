package PolymorphismOverloading;

public class DisplayDetails {

	void details(String name) {
		System.err.print("The Name is = ");
		System.out.println(name);
	}

	void details(String name, int age) {
		System.err.print("The Name and Age is = ");
		System.out.println(name + " " + age);
	}

	public static void main(String[] args) {
		DisplayDetails d = new DisplayDetails();
		d.details("Shruti");
		d.details("Shruti", 21);
	}
}
