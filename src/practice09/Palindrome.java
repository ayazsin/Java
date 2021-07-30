package practice09;

public class Palindrome {

	public static void main(String[] args) {
//		5. Write a method that checks if word is palindrome. 
//		A palindrome is a word, number, phrase, or other sequence of 
//		characters which reads the same backward as forward, 
//		such as madam or racecar or the number 10801.

		
		palindrome("madam");
	}
	
	static void palindrome(String s) {
		String snew ="";
		String[] list1 = s.split("");
		for (int i=list1.length-1; i>=0 ; i--) {
			snew = snew + list1[i];
		}
		
		if (s.equals(snew)) {
			System.out.println("This word is palindrome");
		} else {
			System.out.println("This word is not palindrome");
		}
	
		
	}
}
