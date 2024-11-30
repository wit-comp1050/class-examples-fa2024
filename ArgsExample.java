package examples;

public class ArgsExample {

	public static void main(String[] args) {
		System.out.printf("%d:", args.length);
		for (String arg : args) {
			 System.out.printf(" %s%n", arg);
		} 

	}

}
