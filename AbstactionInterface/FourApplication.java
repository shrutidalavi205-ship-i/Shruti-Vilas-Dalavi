package AbstactionInterface;

public class FourApplication {

	public static void main(String[] args) {

		FourManager m;
		m = new FourManager();
		System.err.println("Manager Details");
		m.bonus();
		System.out.println(" ");
		FourEmployee e;
		e = new FourEmployee();
		System.err.println("Employee Details");
		e.bonus();
	}
}
