package PolymorphismOverrding;

public class SixUser extends SixAdmin {

	@Override
	void name() {
		System.out.println("User");
			}
	
	void use() {
		System.out.println("User is the Child Class");
	}
	
	public static void main(String[] args) {
		
		SixAdmin a = new SixAdmin();
		a.name();
		SixUser u = new SixUser();
		u.name();
		u.use();
	}
}
