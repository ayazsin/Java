package practice04;

import java.util.Scanner;

public class PowerOfNumbers {

	public static void main(String[] args) {
		// Let's get 2 numbers from the user.
		// 1. number base
		// 2. number power
		// Let's calculate the power of the number.
		// 3, 3 results = 27
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number base...");
		int nb = input.nextInt();
		System.out.println("Enter number power...");
		int np = input.nextInt();
		int t = 1;
		
		for (int i=1; i<=np ; i++) {
			t = t * nb;
		}
		System.out.println(nb + " power " + np + " is " + t);
		input.close();
	}

}
