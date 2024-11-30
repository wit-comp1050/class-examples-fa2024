package examples;

public class Scope {
	public static final double DOLLARS_PER_EURO = 1.05;
	

	

	public static double dollarsToEuros(double dollars) {	
		
		return dollars / DOLLARS_PER_EURO;
	}	

	public static double eurosToDollars(double euros) {
		return euros * DOLLARS_PER_EURO;
	
	}	
	


	public static void main(String[] args) {
		
		System.out.printf("1 dollar is %.2f euros%n", dollarsToEuros(1));	
		System.out.printf("1 euro is %.2f dollars%n", eurosToDollars(1));	
	}
	


}
