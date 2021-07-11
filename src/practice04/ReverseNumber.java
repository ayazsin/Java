package practice04;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		  Write a program to get a number from console and reverse of this number.
         */

		 Scanner scan= new Scanner(System.in);
	        System.out.println("Please enter a number");
	        int n = scan.nextInt();
	        
	        while (n>0) {
	        	System.out.print(n%10);
	        	n=n/10;
	        }
	        scan.close();
	}

}
