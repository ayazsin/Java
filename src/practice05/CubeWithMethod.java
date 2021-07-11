package practice05;

import java.util.Scanner;

public class CubeWithMethod {

	public static void main(String[] args) {
		/*
		 * Write a method and get a number from user then calculate cube of this number
         */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = input.nextInt();
		System.out.println(cube(n));
		input.close();
		
		
		
	}
	
	public static double cube(double a) {
		return Math.pow(a, 3);
	}
	

}
