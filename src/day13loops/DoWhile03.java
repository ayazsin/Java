package day13loops;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*
		 Ask user to enter password.
		 If the password has more than 6 characters print "Password is valid..."
		 Otherwise, print "Make the password longer than 6 characters" and ask user to enter a new password
	    */
		
		Scanner scan = new Scanner(System.in);
		String p = "";
		
		do {
			System.out.println("Enter your password...");
			p = scan.nextLine();
			if (p.length()<7) {
				System.out.println("Make the password longer than 6 characters");
			} else {
				System.out.println("Password is valid...");
			}
		} while (p.length()<7);
		
		scan.close();
	

	}

}
