package PojoClass;

public class FiveEmployee {

	String name;
	int empID;
	String city;
	int age;

	public FiveEmployee() {

	}

	public FiveEmployee(String name, int empID, String city, int age) {
		super();
		this.name = name;
		this.empID = empID;
		this.city = city;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "FiveEmployee [name=" + name + ", empID=" + empID + ", city=" + city + ", age=" + age + "]";
	}

}
