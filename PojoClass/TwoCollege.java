package PojoClass;

public class TwoCollege {

	String name;
	String uniName;
	String city;
	int pin;

	public TwoCollege() {

	}

	public TwoCollege(String name, String uniName, String city, int pin) {
		super();
		this.name = name;
		this.uniName = uniName;
		this.city = city;
		this.pin = pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniName() {
		return uniName;
	}

	public void setUniName(String uniName) {
		this.uniName = uniName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "TwoCollege [name=" + name + ", uniName=" + uniName + ", city=" + city + ", pin=" + pin + "]";
	}

}
