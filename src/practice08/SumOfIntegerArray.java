package practice08;

import java.util.Random;
import java.util.Scanner;

public class SumOfIntegerArray {

	public static void main(String[] args) {
		/*
		 Write a program that accepts an integer as input
		 
	    and creates a random integer which
	    less than input and prints the sum of it's digits
	    example:
	            INPUT     : 2548                 
	        OUTPUT :   Random Integer = 1324
	                    I created 1324 and sum of it's digits is =10
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = scan.nextInt();
		Random r = new Random();
		int run1 = r.nextInt(n);
		System.out.println(run1);
		int sum = 0;
		while (run1>0) {
			sum = sum +run1%10;
			run1 = run1/10;
		}
		System.out.println(sum);
		scan.close();
	}

}
