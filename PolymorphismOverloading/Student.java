package PolymorphismOverloading;

public class Student {

	Student(int id) {
		System.err.print("Student ID = ");
		System.out.println(id);
	}

	Student(int id, String name) {
		System.err.print("Student ID and Name = ");
		System.out.println(id + " " + name);
	}

	public static void main(String[] args) {
		Student s = new Student(21);
		Student st = new Student(21, "Shruti");
	}
}
