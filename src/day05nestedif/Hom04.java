package day05nestedif;

import java.util.Scanner;

public class Hom04 {

	public static void main(String[] args) {
		
		/*
		 Ask user enter any name of the week, then get second ,fourth, 
		 and sixth letter of the day name and print them on the console, in the same line.
		 For example; if the user enters “Monday” output will be “ody”
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the name of day");
		String day = input.nextLine();
		System.out.println(day);
		char a,b,c;
		a = day.charAt(1);
		b = day.charAt(3);
		c = day.charAt(5);
		
		System.out.print(a+""+b+""+c);
		
		
		input.close();
	
	}
}
