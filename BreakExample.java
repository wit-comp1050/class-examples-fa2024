package examples;

public class BreakExample {

	public static void main(String[] args) {
		final int[] haystack = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		final int needle = 2;

		boolean found = false;
		int i = 0;

		for (i=0; i<haystack.length; i++) {
			if (haystack[i]==needle) {
				found = true;
				System.out.println("found needle!");
				break;
			}
		}

		System.out.printf("found: %b, loop iterations: %d%n", found, i);

	}

}
