package OverridingAndReferenceCreation;

public class SixStudent extends SixCollage {

	@Override
	void name() {
		System.out.println("Name of the Student");
	}

	@Override
	void sub() {
		System.out.println("Subjec of the Student");
	}

	@Override
	void strength() {
		System.out.println("Strength of the Students");

	}

	public static void main(String[] args) {
		SixCollage c;
		c = new SixTeacher();
		System.out.println("Teacher Details...!");
		c.name();
		c.sub();
		c.strength();
		System.out.println(" ");
		c = new SixStudent();
		System.out.println("Student Details...!");
		c.name();
		c.sub();
		c.strength();

	}
}
