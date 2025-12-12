package InheritancePracticeQuestion;

public class FourCar extends FourVehicle {

	void myDrive() {
		System.out.println("Drive");
	}

	public static void main(String[] args) {

		FourCar c = new FourCar();
		c.myStart();
		c.myDrive();
	}
}
