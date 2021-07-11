package practice01;

import java.util.Scanner;

public class AbsoluteNumIfElse {

	public static void main(String[] args) {
		
		/*
	       * Type java code by using if-else statement,
	       * Write a program to print absolute value of a number entered by user.
	    */
		

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num = input.nextInt();
		
		if (num<0) {
			System.out.println(num*-1);
		} else {
			System.out.println(num);
		}
		
		input.close();
	}

}
