package PojoClass;

public class OneLibrary {

	String libraryName;
	String libraryDepatments;
	String libraryEmplyee;
	String libraryCity;

	public OneLibrary() {

	}

	public OneLibrary(String libraryName, String libraryDepatments, String libraryEmplyee, String libraryCity) {
		super();
		this.libraryName = libraryName;
		this.libraryDepatments = libraryDepatments;
		this.libraryEmplyee = libraryEmplyee;
		this.libraryCity = libraryCity;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryDepatments() {
		return libraryDepatments;
	}

	public void setLibraryDepatments(String libraryDepatments) {
		this.libraryDepatments = libraryDepatments;
	}

	public String getLibraryEmplyee() {
		return libraryEmplyee;
	}

	public void setLibraryEmplyee(String libraryEmplyee) {
		this.libraryEmplyee = libraryEmplyee;
	}

	public String getLibraryCity() {
		return libraryCity;
	}

	public void setLibraryCity(String libraryCity) {
		this.libraryCity = libraryCity;
	}

	@Override
	public String toString() {
		return "OneLibrary [libraryName=" + libraryName + ", libraryDepatments=" + libraryDepatments
				+ ", libraryEmplyee=" + libraryEmplyee + ", libraryCity=" + libraryCity + "]";
	}

}
