package practice02;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		/*Explanation about primeNumber,Prime numbers are numbers that have only 2 factors:
         * 1 and themselves. For example, the first 5 prime numbers are 2, 3, 5, 7, 
         * and 11. By contrast, numbers with more than 2 factors are call composite number.
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter positive number...");
		int n = input.nextInt();
		String k = " is prime number";
		
		if (n<1) {
			System.out.println("You entered 0 or negative number");
		} else {
		
		for (int i=2; i*i<n+1 ; i++) {
			 if (n%i==0) {
				 k = " is not prime number";
				 break;
			 } 
			
		}
		
		System.out.println(n + k);
		
		
		}
input.close();
	}

}
