package InheritancePracticeQuestion;

public class SixC3 extends SixB2 {

	void show() {
		System.out.println("Show C3");
	}

	public static void main(String[] args) {

		SixC3 c = new SixC3();
		c.show();
		c.showB();
		c.showA();
	}
}
