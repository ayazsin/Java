package day10loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter a string
		 Print the characters whose indexes are even in the same line with a space betwen the characters
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string...");
		String s = input.nextLine();
		
//		//1.way:
//		for (int i=0; i < s.length(); i++) {
//			
//			if(i%2==0) {
//				System.out.print(s.charAt(i) + " ");
//			}
//		}
//		
//		//2.way:
//		System.out.println();
//		for (int i=0; i < s.length(); i+=2) {
//			System.out.print(s.charAt(i) + " ");
//			
//		}
		
		/*
		 Ebay Interview Question:
		 Type code to print non repeated characters of any given String
		 */
		
//		for (int i=0; i<s.length(); i++) {
//			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
//				System.out.print(s.charAt(i));
//			}
//		}
		
		/*
		  Very common interview Question
		  Ask user to enter a String
		  Print the String in reverse order
		  Ali ==> ilA
		 */
		
		//1.way:
		for (int i = 0; i<s.length(); i++) {
			System.out.print(s.charAt(s.length()-i-1));
		}
		
		//2.way:
		System.out.println();
		for (int i = s.length()-1; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}
	
		
		
input.close();
	}

}
