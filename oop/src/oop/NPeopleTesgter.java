package oop;

public class NPeopleTesgter {

	public static void main(String[] args) {
		System.out.printf("Peeps: %d%n", 	Person.getNumPeople());

		Person a = new Person();
		System.out.printf("A: %s%n", 	a.getBorgId());
		System.out.printf("Peeps: %d%n", 	Person.getNumPeople());

		Person b = new Person();
		System.out.printf("A: %s%n", 	a.getBorgId());
		System.out.printf("B: %s%n", 	b.getBorgId());
		System.out.printf("Peeps: %d%n", 	Person.getNumPeople());


	}

}
