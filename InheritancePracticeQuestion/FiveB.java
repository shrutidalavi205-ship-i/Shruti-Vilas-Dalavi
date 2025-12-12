package InheritancePracticeQuestion;

public class FiveB extends FiveA {

	
	int b=a*2;
	
	

	public static void main(String[] args) {
		FiveB b = new FiveB();
	System.out.println(b.a);
	System.out.println( "The value is:"+b.b);
	}
}
