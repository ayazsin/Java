package day03increment_decrement_operators;

import java.util.Scanner;

public class SwapRew {

	public static void main(String[] args) {
	
		//Ask user to enter two integer values. Write a Java Program to swap
		//two numbers by using the third variable.
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int temp = 0;
		
		temp = a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println(a+" "+b);
		
		scanner.close();		

	}

}
