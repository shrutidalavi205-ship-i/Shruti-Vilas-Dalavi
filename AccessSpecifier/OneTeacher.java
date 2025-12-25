package AccessSpecifier;

public abstract class OneTeacher extends OnePerson implements OneTeaching {

	public abstract void teacherID();

	public abstract void subject();

	@Override
	public void name() {
		System.out.println("Name of Person");
	}

	@Override
	public void id() {
		System.out.println("ID of Person");
	}

}
