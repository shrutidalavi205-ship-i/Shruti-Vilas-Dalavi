package OneDArrayDeclaration;

public class Seventeen {

	public static void main(String[] args) {
		
	
	int[] num= {34,67,87,95,45,35};
	
	System.out.println("Number Smaller Than 50.");
	
	for (int i = 0; i < num.length; i++) {
		if (num[i] < 50) {
			System.out.println(num[i]);
		}
	}

	}
}