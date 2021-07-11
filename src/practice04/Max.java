package practice04;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		/*
         * ask a user to get 2 numbers and write a program max number.
         */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number...");
		int n1 = input.nextInt();
		System.out.println("Enter second number...");
		int n2 = input.nextInt();
		
//		if (n1==n2) {
//			System.out.println("They are equal");
//		} else if (n1>n2) {
//			System.out.println(n1 + " is the highest number");
//		} else {
//			System.out.println(n2 + " is the highest number");
//		}
		
		System.out.println(n1>n2 ? n1 + " is the highest number" : n2 + " is the highest number" );
		input.close();
	}

}
