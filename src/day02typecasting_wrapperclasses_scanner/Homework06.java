package day02typecasting_wrapperclasses_scanner;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		/*
		  Type a program which calculates the perimeter of a triangle whose Side lengths are entered by user. (Use byte)
			Hint 1: Perimeter of a triangle is a + b + c
			Hint 4: To get byte, use nextByte()
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter three sides of the triangle: ");
		byte s1 = scanner.nextByte();
		byte s2 = scanner.nextByte();
		byte s3 = scanner.nextByte();
		
		
		System.out.println("Perimeter : " + (s1 + s2 + s3));
		scanner.close();
	}

}
