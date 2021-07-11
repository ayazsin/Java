package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		
		//Get an integer from user, then tell to the user if the number is even or odd 
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int num = scanner.nextInt();
		
		if(num%2 == 0) {
			
			System.out.println(num + " is even");
			
		}
		
		if(num%2 != 0) {
			
			System.out.println(num + " is odd");
			
		}
		
		//Get an integer from user, then check if it is negative or not.

		System.out.println("Enter an integer...");
		int num2 = scanner.nextInt();
		if (num2 >= 0) {
			System.out.println(num2 + " is positive");
		}
		if (num2 < 0) {
			System.out.println(num2 + " is negative");
		}
		
		//Get the length and the height of a rectangle from user, if they equal to each other
		//print "Square" on the console, otherwise print "Rectangle" on the console.
		
		System.out.println("Enter length and the height...");
		double length = scanner.nextDouble();
		double height = scanner.nextDouble();
		
		if(height<0 || length<0) {
			System.err.println("Use positive values...");	
		}
		
		if(length == height) {
			System.out.println("Square");
		}
		
		if(length != height) {
			System.out.println("Rectangle");
		}
		
		
		
		scanner.close();
	}

}
