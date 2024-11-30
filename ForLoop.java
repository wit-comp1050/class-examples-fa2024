package examples;

public class ForLoop {
	public static void main(String[] args) {
		for (int i = 1; i < 100; System.out.println(i++));
		for (int i = 0, j = 0; (i + j < 10); i++, j++) {
			int sum = i + j;
			System.out.println(i + " + " + j + " is " + sum);
		}

	}

}
