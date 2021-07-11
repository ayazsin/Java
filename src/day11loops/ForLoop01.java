package day11loops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
	 	Type program to find the sum of the integers from 1 to 100
		 */
		
		int sum  = 0;
		for (int i=1 ; i<101 ; i++) {
			sum = sum + i;
			//If you want to see sum value for every loop, 
			//put System.out.println("sum: " + sum); inside the loop body
		}
		System.out.println("Sum: " + sum);
		//If you want to see just the final sum, 
		//put System.out.println("sum: " + sum); outside the loop body
	
		/*
	 	Ask user to enter starting and ending value, then find the sum of all integers from the starting to the ending value.
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the first and last number...");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int sum2 = 0;
		
		if (n1>n2) {
			System.out.println("Starting value should be greater than ending value.");
		} else {
		
		for (int i = n1 ; i<=n2 ; i++) {
			sum2 = sum2 + i ;
				
		}
		
		System.out.println("Sum from user:  " + sum2);
	
	} 
		input.close();
	}

}
