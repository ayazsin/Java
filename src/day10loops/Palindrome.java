package day10loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string...");
		String s = input.nextLine();
		String r = "";
		
		//reverse string
		for (int i = s.length()-1; i>=0 ; i--) {
			r = r + s.charAt(i);
		}
		
		System.out.println(s.equalsIgnoreCase(r) ? s + " is a palindrome" : s + " is not a palindrome");
	input.close();	

	}

}
