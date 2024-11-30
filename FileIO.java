package examples;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileIO {

	public static void main(String[] args) {
		try (
				
				Scanner fin = new Scanner(new File("numbers.txt"));
				PrintWriter fout = new PrintWriter(new File("odds.txt"));
			) {
				while (fin.hasNextInt()) {
					int next = fin.nextInt();
					if (next % 2 == 1) {
						fout.printf("%d%n", next);
					}
				}
			} catch (FileNotFoundException ex) {
				System.out.printf("File not found!%n");
				System.exit(0);
			}



	}

}
