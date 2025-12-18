package PolymorphismOverrding;

public class NineSubLibrary extends NineLibrary {

	@Override
	void which() {
		System.out.println("Digital Library");
	}

	void name() {
		System.out.println("In this Area a Digital Library is present");
	}

	public static void main(String[] args) {

		NineLibrary l = new NineLibrary();
		l.which();
		NineSubLibrary s = new NineSubLibrary();
		s.which();
		s.name();
	}
}
