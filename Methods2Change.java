package examples;

public class Methods2Change {
	static int b = 5;
	
	//primitive value example
	public static void change(int x) {	
		
		int z = 2;
		x--;	
	}
	
	// array object example
	public static void change2(int[] a) {		
		a[0]--;		
		b = 3;
	}

	public static void main(String[] args) {
		//primitive value example
		int x = 10;
		
		System.out.printf("before: %d", x);
		change(x);
		System.out.printf(", after: %d%n", x);
		
		// array object example
		int[] x2 = {10};
		System.out.printf("before: %d", x2[0]);
		change2(x2);
		System.out.printf(", after: %d%n", x2[0]);
		
	}

}
