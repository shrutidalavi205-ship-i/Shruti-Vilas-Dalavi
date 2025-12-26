package PojoPractice;

import java.util.Scanner;

public class OneStudentInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		OneStudent s = new OneStudent();

		System.out.println("Enter Student ID = ");
		s.setId(sc.nextInt());

		System.out.println("Enter Student Name = ");
		s.setName(sc.next());

		System.out.println("Enter Student Percentage = ");
		s.setPercentage(sc.nextFloat());

		System.out.println("Student ID = " + s.getId());

		System.out.println("Student Name = " + s.getName());

		System.out.println("Student Percentage = " + s.getPercentage());

	}
}
