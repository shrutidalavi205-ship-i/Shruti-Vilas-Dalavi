package InheritancePracticeQuestion;

public class TenZ extends TenY {

	int z = 46;

	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

	public static void main(String[] args) {
		TenZ z = new TenZ();

		z.display();

	}

}
