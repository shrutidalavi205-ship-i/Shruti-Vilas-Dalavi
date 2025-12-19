package OverridingAndReferenceCreation;

public class SixTeacher extends SixCollage {

	@Override
	void name() {
		System.out.println("Name of the Teacher");
	}

	@Override
	void sub() {
		System.out.println("Subject of a Teacher");
	}

	@Override
	void strength() {
		System.out.println("Strength of the Teacher");
	}
}
