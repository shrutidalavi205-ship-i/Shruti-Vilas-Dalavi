package PojoClass;

import java.util.Scanner;

public class OneLibaryInfo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		OneLibrary l = new OneLibrary();

		System.out.println("Enter Library Name = ");
		l.setLibraryName(sc.nextLine());

		System.out.println("In libary how many depatments");
		l.setLibraryDepatments(sc.nextLine());

		System.out.println("In library how many have a Employees");
		l.setLibraryEmplyee(sc.nextLine());

		System.out.println("The City of Library");
		l.setLibraryCity(sc.nextLine());

		System.out.println("Library name = " + l.getLibraryName());
		System.out.println("Departments in library = " + l.getLibraryDepatments());
		System.out.println("Library Employee = " + l.getLibraryEmplyee());
		System.out.println("City of Library = " + l.libraryCity);

	}

}
