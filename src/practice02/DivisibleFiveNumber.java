package practice02;

import java.util.Scanner;

public class DivisibleFiveNumber {

	public static void main(String[] args) {
		
		/*Write a program to print a number entered by user,
		 * which are not divisible by 5 or not divisible by 5
		 */
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = input.nextInt();
		
		System.out.println(n%5==0 ?  n + " is divisible by 5" : n + " is not divisible by 5");

//		if (n%5==0) {
//			System.out.println(n + " is divisible by 5");
//		} else {
//			System.out.println(n + " is not divisible by 5");
//			
//		}
//		
		input.close();
		

	}

}
