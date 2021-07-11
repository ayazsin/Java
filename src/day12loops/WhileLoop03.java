package day12loops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		/*
		 Type java code by using while loop, 
        Write a program to count the factors of an integer which is entered by user.
        Factors of 12 = 1, 2, 3, 4, 6, 12
        Factors of 8  = 1, 2, 4, 8
		 */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number...");
		int n = Math.abs(input.nextInt());	
		
		int counter = 0;//flag
		int i = 1;
		
		while (i<=n) {
			if (n%i==0) {
			System.out.print(i + " ");
			counter++;
			}
			i++;	
		}
		
		System.out.println();
		System.out.println("The factors of " + n + " is " + counter);
		input.close();
	}

}
