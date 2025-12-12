package InheritanceVariablesMethodsConstructor;

public class EightStudent extends EightPerson {

	public EightStudent() {
		super("Vaishnavi", 5464776567l);
	}

	void rollNum() {
		System.out.println("34");
	}

	public static void main(String[] args) {
		System.out.println("Teacher Details");
		EightTeacher t = new EightTeacher();
		t.viewDetails();
		t.num();

		System.out.println(" ");
		System.out.println("Student Details");
		EightStudent s = new EightStudent();
		s.viewDetails();
		s.rollNum();

	}
}
