package day11loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
	 	Type code to find the multiplication of the numbers from 1 to 10
		 */
		
		int m = 1 ;
		for (int i = 1 ; i<=10 ; i++) {
		m = m * i ;	
		}
		System.out.println(m);
		
		/*
	 	Ask user to enter a number the calculate the factorial of it.
	 	5! = 5*4*3*2*1 
	 	
	 	Note: 17! is greater than the maximum value of integer. Because of that if you use int as data type
	 	      in factorial codes you can calculate 16! at most.
	 	      
	 	      Java created another class for huge whole numbers, it is BigDecimal Class but we will learn it later.
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an integer to calvulate its factorial...");
		int f = input.nextInt();
		
		if (f<0) {
			System.out.println("Do not use negative numbers for factorial...");
		} else {
		long m2 = 1 ;
		for (int i = 1 ; i<=f ; i++) {
			m2 = m2 * i ;
		}
		
		System.out.println(f + "!=" + m2);
		}
		
		input.close();
		
	}
		

}
