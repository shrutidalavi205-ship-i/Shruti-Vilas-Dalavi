package InheritancePracticeQuestion;

public class SevenC extends SevenB {

	void myShowC() {
		System.out.println("Show C");
	}

	public static void main(String[] args) {
		SevenC s = new SevenC();
		s.myShowA();
		s.myShowB();
		s.myShowC();
	}
}
