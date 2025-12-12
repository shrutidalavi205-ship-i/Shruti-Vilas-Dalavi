package InheritancePracticeQuestion;

public class TwentyLaptop extends TwentyDevice {

	void myName2() {
		System.out.println("HP");
	}

	public static void main(String[] args) {

		System.out.println("Mobile Devices");
		TwentyMobile m = new TwentyMobile();
		m.myRam();
		m.myCPU();
		m.myName();

		System.out.println(" ");
		System.out.println("Laptop Details");
		TwentyLaptop l = new TwentyLaptop();
		l.myRam();
		l.myCPU();
		l.myName2();

	}

}
