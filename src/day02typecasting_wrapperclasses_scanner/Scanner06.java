package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Scanner06 {

	public static void main(String[] args) {
		
		/*
		  Type a program which calculates the volume of a rectangular prism 
whose length, with, and height are entered by user. 
Hint 1: Volume of a rectangular prism is width x length x height
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the width,length and height of the rectangular prism...");
		double width = scanner.nextDouble();
		double length = scanner.nextDouble();
		double height = scanner.nextDouble();
		
		System.out.println("Volume: " + width * length * height);
		scanner.close();

	}

}
