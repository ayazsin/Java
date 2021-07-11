package day06_ternary_switch;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		/* Type java code by using nested if() statement.
		 	
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your password...");
		char pwd = scanner.next().charAt(0);
		
		
		if (pwd>='A' && pwd <='Z') {
			
			if(pwd=='A') {
				System.out.println("Valid Password");
			
			} else {
				System.out.println("Invalid Password");
			}
			
		} else if (pwd >='a' && pwd <='z') {
			
			if(pwd=='z') {
				System.out.println("Valid Password");
			
			} else {
				System.out.println("Invalid Password");
			       }
				
			} else {
				System.out.println("Use just uppercase or lowercase as an initial");
			}
		
			scanner.close();
			
	}
		

	}

