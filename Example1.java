package examples;

public class Example1 {

	public static void main(String[] args) {

		String a, b;

		a = "Professor ";
		b = "Folajimi";

		System.out.println("My name is " + a + b);
		System.out.println("You're welcome!");
		
		System.out.printf("My name is %s%n", b);
		System.out.println("You're welcome!");
		
		System.out.printf("My name is:%nTitle: %s, Last name: %s%n", a, b);
		System.out.println("you're welcome!");
		
		
		a = String.format("W%sT", "I");  // a = WIT
		b = String.format("%d2%d", "!".length(), a.length());  // b = 123
		System.out.printf("%s %s%n%.2f!%n", a, b, 3.14159);
		
		

		
		

		 


		
	}

}
