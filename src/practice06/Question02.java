package practice06;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		/*
		 * Ask user to enter a character and print the ASCII value of that character
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a character...");
		char ch = scan.next().charAt(0);
		int asc = ch;
		
		System.out.println("ASCII value: " + asc);
		
		scan.close();
	}

}
