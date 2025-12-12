package InheritanceVariablesMethodsConstructor;

public class TenUser {

	String name;
	String userID;
	String loginId;

	public TenUser(String name, String userID, String loginId) {
		this.name = name;
		this.userID = userID;
		this.loginId = loginId;

	}

	void viewDetails() {
		System.err.println("Name = " + name);
		System.err.println("User Id = " + userID);
		System.err.println("Login Id = " + loginId);

	}
}
