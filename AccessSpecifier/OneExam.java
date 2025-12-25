package AccessSpecifier;

public abstract class OneExam implements OneExamRules {

	public abstract void examName();

	public abstract void totalMarks();

	@Override
	public void rule() {
		System.out.println("Rules of exam from OneExam");
	}
}
