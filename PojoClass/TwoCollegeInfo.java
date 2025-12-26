package PojoClass;

import java.util.Scanner;

public class TwoCollegeInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TwoCollege c = new TwoCollege();

		System.out.println("Enter College Name = ");
		c.setName(sc.nextLine());

		System.out.println("Enter University Name = ");
		c.setUniName(sc.nextLine());

		System.out.println("Enter City Name = ");
		c.setCity(sc.nextLine());

		System.out.println("Enter Pin of College Address = ");
		c.setPin(sc.nextInt());

		System.out.println("College Name = " + c.getName());

		System.out.println("University Name = " + c.getUniName());

		System.out.println("City = " + c.getCity());

		System.out.println("Pin = " + c.getPin());

	}
}
