package day06_ternary_switch;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		
		/*
		 Type java code by using nested ternary.
		 Write a program to check if a year is leap year or not.
		 If the year is divisible by 100 then it must be divisible by 4.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year...");
		int year = input.nextInt();
		
		String result = year%100==0 ? 
				(year%400==0 ? year + "is a leap year" : year +  " is not a leap year")  : 
					(year%4==0 ? year + " is a leap year" : year + " is a not leap year");  
		System.out.println(result);

	input.close();
	}

}
