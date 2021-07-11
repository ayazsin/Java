package day13loops;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter an integer
	     If the integer is even print on the console "You won!"
		 Otherwise ask user to enter another integer
		 */
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.println("Enter an integer...");
			n = scan.nextInt();
			
		} while (n%2!=0);
		
		System.out.println("You won");
		
		scan.close();
	}

}
