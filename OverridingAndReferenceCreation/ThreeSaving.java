package OverridingAndReferenceCreation;

public class ThreeSaving extends ThreeAccount {

	@Override
	void roi() {
		System.out.println("Rate of Intrest is 10%");
	}

	@Override
	void balance() {
		System.out.println("You Hava a Balance 10000 Ru");
	}
}
