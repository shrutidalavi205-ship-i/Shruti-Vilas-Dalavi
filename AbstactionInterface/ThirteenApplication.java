package AbstactionInterface;

public class ThirteenApplication {

	public static void main(String[] args) {

		ThirteenStud1 s1;
		s1 = new ThirteenStud1();
		System.out.println("Stud 1 Details");
		s1.name();
		s1.age();
		s1.rollNo();
		System.out.println(" ");
		ThirteenStud2 s2;
		s2 = new ThirteenStud2();
		System.out.println("Stud 2 Details");
		s2.name();
		s2.age();
		s2.rollNo();
	}
}
