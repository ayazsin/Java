package day11loops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {
		/*
	 	Create the following image by getting the number of rows from user
	 				 .
	                 .
	              * * * *
	               * * *
	                * *
	                 * 
	     */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the length of the side...");
		int r = input.nextInt();	
		
		
		for (int i = r ; i>0 ; i--) {
			
			for (int k = 0 ; k<r-i ; k++) {
				System.out.print(" ");
			}
			
			for (int j = i ; j>0 ; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
	input.close();

	}

}
