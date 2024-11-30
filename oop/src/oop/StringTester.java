package oop;

public class StringTester {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder();
		System.out.println(s);
		s.append("Welcome ");
		System.out.println(s);
		s.append("to");
		s.append(" ");
		s.append("Java!");
		System.out.println(s);
//		
		s.insert(11, "HTML and ");
		System.out.println(s);
		s.delete(8, 11); // Welcome HTML and Java!
		System.out.println(s);
		
		StringBuilder a = new StringBuilder("Hello");
		a.deleteCharAt(2); 
		System.out.println(a);
		
		s.deleteCharAt(s.length()-1); // Welcome HTML and Java
		System.out.println(s);
		s.reverse(); // avaJ dna LMTH emocleW
		System.out.println(s);
		s.reverse().replace(8, 16, "HTML"); // Welcome HTML Java
		System.out.println(s);
		s.setCharAt(0, 'w'); // welcome HTML Java
		System.out.println(s);
//

	}

}
