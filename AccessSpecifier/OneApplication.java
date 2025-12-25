package AccessSpecifier;

public class OneApplication {

	public static void main(String[] args) {

		OneOnlineTeacher o = new OneOnlineTeacher();

		System.out.println("Online Teachers Details");

		o.id();
		o.name();
		o.rule();
		o.subject();
		o.teacherID();

		System.out.println(" ");

		OneFinalExam f = new OneFinalExam();

		System.out.println("Final Exam Details");

		f.examName();
		f.rule();
		f.totalMarks();

	}
}
