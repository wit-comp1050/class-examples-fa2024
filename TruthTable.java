package examples;

public class TruthTable {

	public static void main(String[] args) {
		boolean[] tf = {false, true};		
		for (boolean a : tf) {			
			for (boolean b : tf) {				
				for (boolean c : tf) {		
					System.out.printf(
						"%-5s | %-5s | %-5s | %-5s%n", 
						a, b, c, 
						((a && !b) || (!a && b)) && !c);
				}			
			}		
		}


	}

}
