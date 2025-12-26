package PojoClass;

import java.util.Scanner;

public class FiveEmployeeInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FiveEmployee e = new FiveEmployee();

		System.out.println("Enter Employee Name = ");
		e.setName(sc.nextLine());

		System.out.println("Enter Employee ID = ");
		e.setEmpID(sc.nextInt());

		System.out.println("Enter Employee City = ");
		e.setCity(sc.next());

		System.out.println("Enter Age = ");
		e.setAge(sc.nextInt());

		System.out.println("Employee Name = " + e.getName());

		System.out.println("Employee ID = " + e.getEmpID());

		System.out.println("City = " + e.getCity());

		System.out.println("Age = " + e.getAge());

	}
}
