package PolymorphismOverrding;

public class SevenSubTeacher extends SevenTeacher {

	@Override
	void name() {
		System.out.println("Subject Name");	
		}
	
	void sub() {
		System.out.println("Maths");
	}
	
	public static void main(String[] args) {
		
		SevenTeacher t = new SevenTeacher();
		t.name();
		SevenSubTeacher s = new SevenSubTeacher();
		s.name();
		s.sub();
	}
}
