package practice03;

import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		/*Write a java program to get 5 numbers from keyboard and find their sum and average.
	      * Example:Input 5 numbers:
	      * 1
	      * 2
	      * 3
	      * 4
	      * 5
	      * Output :
	      * The Sum of 5 number is: 15
	      * The Average is :3
	      *
	      */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter five number...");
		int n1 = input.nextInt();	
		int n2 = input.nextInt();	
		int n3 = input.nextInt();	
		int n4 = input.nextInt();	
		int n5 = input.nextInt();	
		
		System.out.println("The Sum of 5 number is: " + (n1+n2+n3+n4+n5));
		System.out.println("The Averager of 5 number is: " + ((n1+n2+n3+n4+n5)/5));
		
		input.close();
	}

}
