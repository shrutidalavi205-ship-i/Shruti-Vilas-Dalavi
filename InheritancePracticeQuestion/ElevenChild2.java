package InheritancePracticeQuestion;

public class ElevenChild2 extends ElevenParent {

	void myName2() {
		System.out.println("Ganesh");
	}

	public static void main(String[] args) {

		System.err.println("Child 1 Details");
		ElevenChild1 c = new ElevenChild1();
		c.myName();
		c.myName1();
		System.out.println("  ");

		System.err.println("Child 2 Details");
		ElevenChild2 c1 = new ElevenChild2();
		c1.myName();
		c1.myName2();
	}
}
