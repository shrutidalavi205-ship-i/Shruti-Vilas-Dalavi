package PojoPractice;

import java.util.Scanner;

public class SevenMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Employee Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter City: ");
        String city = sc.nextLine();

        System.out.print("Enter State: ");
        String state = sc.nextLine();

        SevenAddress add = new SevenAddress(city, state);

        SevenEmployee emp = new SevenEmployee(state, state, id, name, add);

        System.out.println("Employee Details...!");
        emp.show();
	}
}
