package Scanner;

import java.util.Scanner;

public class ElevenTempToFahre {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Temprature in Celsius");
		double temp = sc.nextDouble();
		
		double ferh = (temp * 9.0/5)+32;
		
		System.out.println("The Temprature in Fehrenheit = " + ferh);
		
		
	}
}
