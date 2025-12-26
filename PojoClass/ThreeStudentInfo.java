package PojoClass;

import java.util.Scanner;

public class ThreeStudentInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ThreeStudent s = new ThreeStudent();

		System.out.println("Enter Student Name = ");
		s.setName(sc.nextLine());

		System.out.println("Enter Student Roll No = ");
		s.setRollNo(sc.nextInt());

		System.out.println("Enter Student City = ");
		s.setCity(sc.next());

		System.out.println("Enter Student Phone No. = ");
		s.setPhoneNo(sc.nextLong());

		System.out.println("Student Name = " + s.getName());

		System.out.println("Student Roll No. = " + s.getRollNo());

		System.out.println("Student City = " + s.getCity());

		System.out.println("Student Phone No. = " + s.getPhoneNo());
	}
}
