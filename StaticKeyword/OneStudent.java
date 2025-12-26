package StaticKeyword;

public class OneStudent {

	static String collegeName = "Bapuji Salunkhe College, Miraj";
	int id;
	String name;

	public OneStudent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {
		OneStudent s = new OneStudent(1, "Shruti");
		OneStudent s2 = new OneStudent(2, "Vaishnavi");

		s.display();
		s2.display();
	}

	void display() {
		System.out.println("College Name = " + collegeName);
		System.out.println("ID = " + id);
		System.out.println("Name = " + name);

	}
}
