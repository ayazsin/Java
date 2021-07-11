package practice02;

import java.util.Scanner;

public class RepeatedLetters {

	public static void main(String[] args) {
		/*
		 Ask user for a string and print a new string made of 3 copies of the last 2 letters
The strings length will be at least 2.
ORNEK:
   INPUT      : Mustafa
   OUTPUT     : fafafa
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string...");
		String s = input.nextLine();
		
		for (int i=1 ; i<4 ; i++) {
		System.out.print(s.substring(s.length()-2));
		}
	input.close();
	}

}
