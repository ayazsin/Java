package day05nestedif;

import java.util.Scanner;

public class Question02LDFD {

	public static void main(String[] args) {
		/*
		 	Ask user to enter a 4 digit integer, then print the sum of the first
		 	and the last digits of the number on the console.
		 	For example; if user enters 1234 you will add 1 and 4, then print on the console 5
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a four digit integer...");
		int num = scanner.nextInt();
		
		// Mutlak deger
		num = Math.abs(num);
		
		if(num>999 && num<10000) {
			int first = num/1000;
			int last = num % 10;
			
			System.out.println("The sum is " + (first + last));
		
		} else {
			System.err.println("You entered a number out of range");
		}
		scanner.close();
	}

}
