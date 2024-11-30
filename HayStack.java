package examples;

public class HayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4, 5, 4, 6, 9};
		System.out.println(searchArray(a, 4));
		System.out.println(searchArray(a, 6));
		System.out.println(searchArray(a, 7));

	}
	
	public static int searchArray(int[] haystack, int needle) {
		for (int i=0; i<haystack.length; i++) {
			if (haystack[i] == needle) {
				System.out.println(needle + " found at index " + i);
				return i;
			}
		}
		return -1;
	}


}
