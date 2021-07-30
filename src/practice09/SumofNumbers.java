package practice09;

import java.util.Scanner;

public class SumofNumbers {

	public static void main(String[] args) {
		 //1. Write a method that returns the sum of numbers 
		//starting with 1 to the number passed into the method.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int y = scan.nextInt();
		System.out.println(sum(y));
		scan.close();

	}
	
	static int sum(int y) {
		int sum = 0;
		for (int i = 1; i<=y; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

}
