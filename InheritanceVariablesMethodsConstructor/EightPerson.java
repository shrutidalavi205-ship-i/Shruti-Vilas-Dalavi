package InheritanceVariablesMethodsConstructor;

public class EightPerson {

	String name;
	long phoneNum;

	public EightPerson(String name, long phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;

	}

	void viewDetails() {
		System.err.println("Name = " + name);
		System.err.println("Phone Number = " + phoneNum);

	}
}
