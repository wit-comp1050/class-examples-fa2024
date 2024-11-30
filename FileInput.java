package examples;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInput {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		int x = input.nextInt();
		
		System.out.println(x);
		
		
		File f = new File("xx.txt");
		
		try {
			Scanner s = new Scanner(new File("xx.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Error, file not found!");
			System.exit(0);			
		}
		
		try (Scanner fin = new Scanner(f)) { 
			while (fin.hasNextLine()) {
				String nextLine = fin.nextLine();
				System.out.printf(nextLine+"%n");
			}
		} catch (FileNotFoundException ex) {
				System.out.printf("File not found!%n");
				System.exit(0);
		}
		
		
		try (PrintWriter fout = new PrintWriter(new File("numbers.txt"))) {
			for (int i=1; i<=100; i++) {
				fout.printf("%d%n", i);
				//System.out.printf("%d%n", i);
			}
		} catch (FileNotFoundException ex) {
			System.out.printf("File not found!%n");
			System.exit(0);
		}


	}

}
