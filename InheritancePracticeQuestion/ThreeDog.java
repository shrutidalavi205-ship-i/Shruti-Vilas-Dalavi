package InheritancePracticeQuestion;

public class ThreeDog extends ThreeAnimal{

	void myBark() {
		System.out.println("The Dog is Barking");
	}
	
	public static void main(String[] args) {
		
		ThreeDog t = new ThreeDog();
		t.myEat();
		t.myBark();
	}
}
