package examples;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		//Triggers inputmismartch exception. Needs to be handled
		Scanner input0 = new Scanner(System.in);		
		int inputValue0 = 0;		
		System.out.printf("Enter an integer: ");
		inputValue0 = input0.nextInt();		
		System.out.printf("%d^2=%d%n", 	inputValue0, inputValue0*inputValue0);
		
		Scanner inputx = new Scanner(System.in);		
		double inputValuex = 0;		
		System.out.printf("Enter an integer: ");
		inputValuex = inputx.nextDouble();		
		System.out.printf("%d^2=%d%n", 	inputValue0, inputValue0*inputValue0);
		
		// handled exception
		Scanner input = new Scanner(System.in);		
		int inputValue = 0;	
		boolean b = false;
		int i = 0;
		
		 
			if (i<=4) {
			try {
				System.out.printf("Enter an integer: ");
				inputValue = input.nextInt();
				b = true;
				i++;
			} catch (InputMismatchException ex) {
				System.out.printf("Error! Integer required!%n");
				b = false;
				i++;
				//System.exit(0);
			}
			
			}
		while (b == false);
		
		
		System.out.println("thanks");
//			
//		System.out.printf("%d^2=%d%n", 
//				inputValue, inputValue*inputValue);	
//		
//		System.out.println(readInt(input));
	}
	
	public static int readInt(Scanner s) throws InputMismatchException {
		System.out.print("Enter an integer: ");
		return s.nextInt();
	}


}
