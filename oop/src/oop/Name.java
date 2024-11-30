package oop;

public class Name {
	
	final private String fName;
	final private String lName;

	public Name(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	
	public String toString() {
		return String.format("%s %s", fName, lName);
	}


}
