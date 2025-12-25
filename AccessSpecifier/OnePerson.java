package AccessSpecifier;

public abstract class OnePerson implements OneTeaching, OneExamRules {

	public abstract void name();

	public abstract void id();

	@Override
	public void rule() {
		System.out.println("Rules for Exam ");
	}

}
