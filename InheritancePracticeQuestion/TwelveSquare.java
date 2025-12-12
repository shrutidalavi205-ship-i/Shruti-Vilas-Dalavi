package InheritancePracticeQuestion;

public class TwelveSquare extends TwelveShape {

	void mySquare() {
		System.out.println("Square");
	}

	public static void main(String[] args) {

		TwelveCircle c = new TwelveCircle();
		System.out.println("Circle Details");
		c.myShape();
		c.myCircle();

		System.out.println("  ");
		System.out.println("Square Details");
		TwelveSquare s = new TwelveSquare();
		s.myShape();
		s.mySquare();

	}
}
