package InheritancePracticeQuestion;

public class NineteenC extends NineteenB {

	int c = 78;

	void myC() {
		System.out.println(c);
	}

	public static void main(String[] args) {

		System.out.println("A Details");
		NineteenA a1 = new NineteenA();
		a1.myA();

		System.out.println(" ");
		System.out.println("B Details");
		NineteenB b1 = new NineteenB();
		b1.myA();
		b1.myB();

		System.out.println(" ");
		System.out.println("C Details");
		NineteenC c1 = new NineteenC();
		c1.myA();
		c1.myB();
		c1.myC();
	}
}
