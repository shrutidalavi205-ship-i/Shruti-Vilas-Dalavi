package InheritancePracticeQuestion;

public class OneB extends OneA {

	void showB() {
		System.out.println("Show B");
	}

	public static void main(String[] args) {

		OneB b = new OneB();
		b.showB();
		b.showA();
	}
}
