package InheritancePracticeQuestion;

public class EighteenMoniter extends EighteenStudent {

	void myMoniter() {
		System.out.println("Moniter");
	}

	public static void main(String[] args) {
		System.out.println("Teacher Details");
		EighteenTeacher t = new EighteenTeacher();
		t.collegeInfo();
		t.myTeacher();
		
		System.out.println("");
		
		System.out.println("Student Details");
		
		EighteenStudent s = new EighteenStudent();
		s.collegeInfo();
		s.myStudent();
		
		System.out.println(" ");
		
		System.out.println("Moniter Details");
		
		EighteenMoniter m = new EighteenMoniter();
		m.collegeInfo();
		m.myStudent();
		m.myMoniter();

	}
}
