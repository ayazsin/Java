package practice03;

import java.util.Scanner;

public class CheckNumbers {

	public static void main(String[] args) {
		/*ask a user to get numbers and write a program that accepts two integer numbers 
		 * and check if they are equal.
		   * Input: first number= 1234
		   *        second number=1234
		   * Output:these numbers are equal
		   *
		   */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter two number...");
		int n1 = input.nextInt();	
		int n2 = input.nextInt();	
		
		if (n1==n2) {
			System.out.println("These numbers are equal");
		} else {
			System.out.println("These numbers are not equal");
		}
		
		input.close();
	}

}
