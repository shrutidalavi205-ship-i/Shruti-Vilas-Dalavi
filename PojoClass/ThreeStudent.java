package PojoClass;

public class ThreeStudent {

	String name;
	int rollNo;
	String city;
	long phoneNo;

	public ThreeStudent() {

	}

	public ThreeStudent(String name, int rollNo, String city, long phoneNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.city = city;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "ThreeStudent [name=" + name + ", rollNo=" + rollNo + ", city=" + city + ", phoneNo=" + phoneNo + "]";
	}

}
