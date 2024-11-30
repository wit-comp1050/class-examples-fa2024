package examples;

public class Change {

	public static void main(String[] args) {
		int a = 10;
		int[] x = {10};
		
		System.out.println("primitive before value: " + a);
		System.out.println("primitive after value: " + change2(a));
		
		
		System.out.println("object before value: " + x[0]);
		System.out.println("object after value: " + change(x));	
		
		int y = change(x);
		
		System.out.println(y);
	
	
	}
	
	public static int change2(int a) {
		return a-- ;
	}
	
	public static int change(int[] x) {
		return x[0]-- ;
	}
	

}
