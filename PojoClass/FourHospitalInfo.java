package PojoClass;

import java.util.Scanner;

public class FourHospitalInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		FourHospital h = new FourHospital();

		System.out.println("Enter Hospital Name = ");
		h.setName(sc.nextLine());

		System.out.println("Enter City = ");
		h.setCity(sc.nextLine());

		System.out.println("Enter No. of Wards = ");
		h.setWard(sc.nextInt());

		System.out.println("Enter Deparments of Hospital = ");
		h.setDepartments(sc.next());

		System.out.println("Hospital Name = " + h.getName());

		System.out.println("City = " + h.getCity());

		System.out.println("Wards = " + h.getWard());

		System.out.println("Departments = " + h.getDepartments());
	}
}
