package InheritancePracticeQuestion;

public class SixteenD extends SixteenC {

	void myName3() {
		System.out.println("Name D");
	}

	public static void main(String[] args) {
		System.out.println("B Details ");

		SixteenB b = new SixteenB();
		b.myName();
		b.myName2();

		System.out.println(" ");
		System.out.println("C Details");
		SixteenC c = new SixteenC();
		c.myName();
		c.myName3();

		System.out.println("  ");
		System.out.println("D Details");
		SixteenD d = new SixteenD();
		d.myName();
		d.myName3();
	}
}
