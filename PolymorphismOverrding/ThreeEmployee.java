package PolymorphismOverrding;

public class ThreeEmployee extends ThreeManager {

	@Override
	void name() {
		System.out.println("Employee Name");
	}

	void salary() {
		System.out.println("Employee salary is 50000 ru");
	}

	public static void main(String[] args) {

		ThreeManager m = new ThreeManager();
		m.name();
		ThreeEmployee e = new ThreeEmployee();
		e.name();
		e.salary();
	}
}
