package InheritancePracticeQuestion;

public class TwoChild extends TwoParent {

	void MyVariable2() {
		int y = 20;
		System.out.println(" y = " + y);
	}

	public static void main(String[] args) {

		System.out.println("Parent Class Details");

		TwoChild t = new TwoChild();
		t.MyVariable();
		t.MyVariable2();
	}
}
