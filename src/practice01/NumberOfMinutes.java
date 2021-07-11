package practice01;

import java.util.Scanner;

public class NumberOfMinutes {

	public static void main(String[] args) {
	
		/* Ask user to enter minutes,
	       * Write a Java program to convert minutes into a number of years and days.
	       * Input: number of minutes 3456789
	       * Output: 3456789 minutes is approximately 6 years and 210 days
	       */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter minutes");
		int min = input.nextInt();
		
		long years = min / ( 60 * 24 * 365 );
		long days = (min / 60/ 24 ) % 365;
		
		System.out.println(min + " minutes is approximately " 
		+ years + " years and " + days  + " days");
		
		input.close();
	}

}
