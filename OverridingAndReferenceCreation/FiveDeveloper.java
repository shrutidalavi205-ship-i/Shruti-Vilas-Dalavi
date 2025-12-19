package OverridingAndReferenceCreation;

public class FiveDeveloper extends FiveCEO {

	@Override
	void name() {
		System.out.println("The Name of the Developer");
	}

	@Override
	void department() {
		System.out.println("The Department of the Developer");
	}

	@Override
	void salary() {
		System.out.println("The Salary of the Developer");
	}

	public static void main(String[] args) {

		FiveCEO c;
		c = new FiveManager();
		System.out.println("Manager Details ...!");
		c.name();
		c.department();
		c.salary();
		System.out.println(" ");
		c = new FiveDeveloper();
		System.out.println("Developers Details ...!");
		c.name();
		c.department();
		c.salary();
	}
}
