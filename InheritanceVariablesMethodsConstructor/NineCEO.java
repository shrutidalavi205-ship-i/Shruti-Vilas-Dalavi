package InheritanceVariablesMethodsConstructor;

public class NineCEO {

	String name;
	double salary;

	public NineCEO(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}

	void viewDetails() {
		System.err.println("Name = " + name);
		System.err.println("Salary = " + salary);

	}
}
