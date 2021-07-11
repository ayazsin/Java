package day03increment_decrement_operators;

import java.util.Scanner;

public class HomMod {

	public static void main(String[] args) {
		/* 
		1) Type a program like;
		Ask user to enter two integer values, the first will be greater than the second. 
		The remainder when you divide the first by the second will be the width,
		and the sum of the two numbers will be the length of a rectangle.
		Then calculate the area and the perimeter of the rectangle, and print them
		on the console.
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two integer values, the first will be greater than the second... ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		double width = a%b;
		int length = a + b;
		System.out.println("Perimeter..." + (2*width+2*length));
		System.out.println("Area..."+(width*length));
		
		scanner.close();

	}

}
