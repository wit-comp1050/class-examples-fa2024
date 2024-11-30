package examples;

public class Methods {

	public static void main(String[] args) {
		
		noReturn(5, 9);
		
		int answer = smallerOf(23, 25);
		
		System.out.println(answer);
		
		int a = 1, b = 2;
		int ans1 = smallerOf(50, 30);
		System.out.println(ans1);
		
		System.out.println(smallerOf(60, 120));

		
		
		System.out.printf("%d %d %d%n", a, a, smallerOf(a, a));		
		System.out.printf("%d %d %d%n", b, b, smallerOf(b, b));			
		System.out.printf("%d %d %d%n", a, b, smallerOf(a, b));			
		System.out.printf("%d %d %d%n", b, a, smallerOf(b, a));	
		System.out.println(smallerOf(80, 89) + smallerOf(44, 42));
		
		
	}
	
	

	
	public static int smallerOf(int a, int b) {
		if (a <= b) {
			return a;
		}
		else
			return b;
	}
	
	// using ternary operator
	public static int smallerOfEx2(int a, int b) {
	return (a<=b)?a:b;
}
	
	public static int smallerOfEx2(int a, int b, int c) {
	return (a<=b)?a:b;
}



	public static int smallerOfEx2(int a, int b, double c) {
	return (a<=b)?a:b;
}

	
	
	private static int smaller() {
		return 1;
	}
	
	

	
	 static double smaller2() {
		return 1.5;
	}
	 
	 static String stringReturn() {
			return "Yetty";
		}
	 
	 static void noReturn(int a, int b) {
		 System.out.println(a+b);			
		}
	
	



}
