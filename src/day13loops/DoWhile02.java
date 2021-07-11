package day13loops;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter his/her first name
		 If the initial is lower case print a message like "Make the initial upper case"
		 If the initial is upper case print a message like "You did it right"
	    */
		
		Scanner scan = new Scanner(System.in);
		char n = '?';
		
		do {
			System.out.println("Enter your name...");
			n = scan.next().charAt(0);
			
			if (!(n>='A' && n<='Z')) {
				System.out.println("Make the initial upper case");
			}
			
		} while (!(n>='A' && n<='Z'));
		
		System.out.println("You did it right");
		
		scan.close();

	}

}
