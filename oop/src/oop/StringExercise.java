package oop;

public class StringExercise {

	public static void main(String[] args) {
		String[] myWords = {"correct","horse","battery","staple"};	
		
		System.out.printf("%s%n",makeSentence(myWords));

		

	}
	
	public static String makeSentence(String[] words) {
		StringBuilder sentence = new StringBuilder();
		for(String w: words){
			sentence.append(w + " ");
		}
		return sentence.toString();
	}


}
