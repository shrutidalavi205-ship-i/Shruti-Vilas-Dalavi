package PojoClass;

public class FourHospital {

	String name;
	String city;
	int ward;
	String departments;

	public FourHospital() {

	}

	public FourHospital(String name, String city, int ward, String departments) {
		super();
		this.name = name;
		this.city = city;
		this.ward = ward;
		this.departments = departments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getWard() {
		return ward;
	}

	public void setWard(int ward) {
		this.ward = ward;
	}

	public String getDepartments() {
		return departments;
	}

	public void setDepartments(String departments) {
		this.departments = departments;
	}

	@Override
	public String toString() {
		return "FourHospital [name=" + name + ", city=" + city + ", ward=" + ward + ", departments=" + departments
				+ "]";
	}

}
