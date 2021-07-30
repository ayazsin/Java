package practice09;

public class LettersAndNumbers {

	public static void main(String[] args) {
//		3. Write method that accepts a String and extracts letters and numbers. 
//		Method should return a String. 
//		EX: a1b2c3 --> Letters are abc and numbers are 123.
		letterAndNumbers("z7a1b2c3");
	}
	
	static void letterAndNumbers(String s) {
		String l = "";
		String n = "";
		
		for (int i = 0; i<s.length(); i++) {
//			if (s.charAt(i)>='A' && s.charAt(i)<='z') {
			if (Character.isLetter(s.charAt(i))) {
				l = l + s.charAt(i);
//			} else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
			} else if (Character.isDigit(s.charAt(i))) {
				n = n + "" + s.charAt(i);
			}
		}
		System.out.println("Letters are " + l + " and numbers are " + n + ".");
	}

}
