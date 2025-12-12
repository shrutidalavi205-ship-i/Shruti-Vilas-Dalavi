package InheritancePracticeQuestion;

public class FifteenTeacher extends FifteenPerson {

	void myName3() {
		System.out.println("Teacher Name");
	}

	public static void main(String[] args) {

		System.err.println("Student Details");
		FifteenStudent s = new FifteenStudent();
		s.myName();
		s.myName2();

		System.out.println(" ");
		System.err.println("Teachers Details");
		FifteenTeacher t = new FifteenTeacher();
		t.myName();
		t.myName3();

	}
}
