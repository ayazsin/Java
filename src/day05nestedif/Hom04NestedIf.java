package day05nestedif;

import java.util.Scanner;

public class Hom04NestedIf {

	public static void main(String[] args) {
		/*
		    Type java code by using nested if() statement. Ask user to enter a password
			If the initial of the password is uppercase then check if it is ‘A’ or not.
			If it is ‘A’ the output will be “Valid Password”
			otherwise the output will be “Invalid Password”
			For example; Ali ==> Valid password - ali ==> Invalid - Mark ==> Invalid
			If the initial of the password is lowercase then check if it is ‘z’ or not.
			If it is ‘z’ the output will be “Valid Password”
			otherwise the output will be “Invalid Password”
			For example; zoe ==> Valid password - Zoe ==> Invalid - john ==> Invalid
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the password");
		String p = input.nextLine();
		
		char a;
		a = p.charAt(0);
		
		//Check uppercase with ASCII codes
		if (a>=65 && a<=90) {
			if (a == 'A') {
				System.out.println("Valid Password");
			} else {
				System.out.println("Invalid Password");
			}
		//Check lowercase with ASCII codes
		} else if (a>=97 && a<=122) {
			if (a == 'z') {
				System.out.println("Valid Password"); 
			} else { 
				System.out.println("Invalid Password");
			}
		} else {
			System.out.println("Invalid Password");
		}

	input.close();	
	}

}
