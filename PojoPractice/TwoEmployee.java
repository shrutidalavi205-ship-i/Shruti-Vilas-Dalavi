package PojoPractice;

public class TwoEmployee extends TwoPerson {

	double salary;

	public TwoEmployee(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}

	void display() {

		System.out.println("Name = " + name);

		System.out.println("Age = " + age);

		System.out.println("Salary = " + salary);
	}

}
