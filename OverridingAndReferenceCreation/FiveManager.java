package OverridingAndReferenceCreation;

public class FiveManager extends FiveCEO {

	@Override
	void name() {
		System.out.println("The name of Manager");
	}

	@Override
	void department() {
		System.out.println("The Department of Manager");
	}

	@Override
	void salary() {
		System.out.println("The Salary of Manager");
	}
}
