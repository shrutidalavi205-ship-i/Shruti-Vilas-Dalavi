package InheritancePracticeQuestion;

public class FourteenC extends FourteenA {

	void m3() {
		System.out.println("m3");
	}

	public static void main(String[] args) {

		System.out.println("B Details");
		FourteenB b = new FourteenB();
		b.m1();
		b.m2();

		System.out.println("  ");
		System.out.println("C Details");
		FourteenC c = new FourteenC();
		c.m1();
		c.m3();
	}
}
