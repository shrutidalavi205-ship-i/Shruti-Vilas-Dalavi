package PolymorphismOverrding;

public class TenDepartment extends TenCollege {

	@Override
	void name() {
		System.out.println("Computer Science");
	}

	void department() {
		System.out.println("In this Collge so many departments like Computer Science");
	}

	public static void main(String[] args) {

		TenCollege c = new TenCollege();
		c.name();
		TenDepartment d = new TenDepartment();
		d.name();
		d.department();
	}
}
