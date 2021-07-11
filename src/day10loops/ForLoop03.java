package day10loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
	/*
	 Ask user to enter a String
	 Check if the String is Palindrome or not
	 anna 	<==>  anna
	 1223221 <==> 1223221
	 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string...");
		String s = input.nextLine();
		String reversed = "";
	
		for (int i = s.length()-1; i>=0 ; i--) {
			reversed = reversed + s.charAt(i);
		}
		if (s.equalsIgnoreCase(reversed)) {
			System.out.println(s + " is Palindrome");
		} else {
			System.out.println(s + " is not Palindrome");
		}
	
		input.close();
	}

}
