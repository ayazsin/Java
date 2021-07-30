package adeneme;

public class SumOfdigitsInAString {

	public static void main(String[] args) {
//		Write a method which accepts a String as parameter and prints 
//		the sum of the digits, present in the given string.
//
//		input : ade1r4d3
//
//		output : 8
//
//		     Hint :
//		     Use Character.isDigit()
//		     Integer.valueOf()
		
		String s="ade1r4d3";
		System.out.println(sumOfdigitsInAString(s));

	}
	static int sumOfdigitsInAString(String s) {
		int sum =0;
		for (int i=0; i<s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				sum = sum + Integer.valueOf(s.substring(i,i+1));
			}
		}
		
		
		return sum;
		
	}
}
