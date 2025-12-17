package PolymorphismOverloading;

public class Static {

	void print(String fName) {
		System.err.print("Name = ");
		System.out.println(fName);
	}

	void print(String fName, String lName) {
		System.err.print("First Name + Last Name = ");
		System.out.println(fName + " " + lName);
	}

	public static void main(String[] args) {

		Static s = new Static();
		s.print("Shruti");
		s.print("Shruti", "Dalavi");
	}

}
