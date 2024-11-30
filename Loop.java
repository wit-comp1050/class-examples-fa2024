package examples;

import java.util.Scanner;

public class Loop {
	
	//while loop
	public static void main(String[] args) {
		int x = 1, y = 1;		
//		while (x<100) {	
//			System.out.printf("%d %d%n", x, y);
//			x *= 2;			
//			y++;		
//		}
//		System.out.printf("final values are, x = %d and y = %d%n", x, y);
		
// the code in this loop will never execute
		while (x==10) {	
			System.out.printf("%d %d%n", x, y);
			x *= 2;			
			y++;		
		}
		
//	likewise	
		while (x>10) {	
			System.out.printf("%d %d%n", x, y);
			x *= 2;			
			y++;		
		}
	// executes once	
		while (x == 1) {	
			System.out.printf("%d %d%n", x, y);
			x *= 2;			
			y++;		
		}

// Infinite loop. Avoid it!
		while (x>=1) {	
			System.out.printf("%d %d%n", x, y);
			x *= 2;			
			y++;		
		}
		
				
		// do-while loop
		int z;		
		Scanner s = new Scanner(System.in);		
		do {			
			System.out.printf("Enter 1 to loop: ");	
			z = s.nextInt(); 
		} while (z == 1);		
		System.out.printf("Freedom!%n");
		
		
		int i=0;		
		while (i<10) {			
			System.out.printf("%d%n", i);
			i++;		
		}
		System.out.println("-------------");
		// for loop equivalent
		for (int j = 7; j<10; j++) {
			System.out.printf("%d%n", j);
		}
		
		for (double j = 7; j<10; j++) {
			System.out.printf("%f%n", j);
		}
		
//		nesting
		for (int k = 1; k < 50; k+=2) {
			if(k != 47 && k <=10) {
				System.out.println(k);
			}
		}
		System.out.println("---------------------");
//		//nested loop
		for (int m = 1; m < 10; m++) {
			System.out.printf("%d ", m);
			for (i = 1; i<=3; i++) {
			System.out.printf(":-) ");
			}
			System.out.println();
		}
//
		System.out.println("Bye for now!");


	}

}
