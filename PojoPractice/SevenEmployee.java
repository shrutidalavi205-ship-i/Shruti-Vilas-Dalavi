package PojoPractice;

public class SevenEmployee extends SevenAddress {

	int id;
	String name;
	SevenAddress sevenAddress;

	public SevenEmployee(String city, String state, int id, String name, SevenAddress address) {
		super(city, state);
		this.id = id;
		this.name = name;
		this.sevenAddress = address;

	}

	void show() {
		System.out.println("Employee Id   : " + id);
		System.out.println("Employee Name : " + name);
		sevenAddress.display();
	}
}
