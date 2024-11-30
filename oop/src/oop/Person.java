package oop;

public class Person {
	private static int numPeople = 0;
	private final int myId;

	public Person() {
		numPeople++;
		myId = numPeople;
	}

	public int getId() {
		return myId;
	}

	public String getBorgId() {
		return String.format("%d of %d", myId, numPeople);
	}

	public static int getNumPeople() {
		return numPeople;
	}
	


}
