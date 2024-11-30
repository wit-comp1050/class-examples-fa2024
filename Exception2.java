package examples;

import java.io.IOException;

public class Exception2 {
	public static void doSomethingBad() throws IOException {
		throw new IOException("Oops");
	}

	public static void main(String[] args) {
		try {
			doSomethingBad();
			System.out.printf("Yay :)%n");
		} catch (IOException e) {
			System.out.printf("%s :(%n", e.getMessage());
		}
	}


}
