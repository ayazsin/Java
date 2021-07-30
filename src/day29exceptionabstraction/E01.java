package day29exceptionabstraction;

import java.util.Scanner;


public class E01 {

	public static void main(String[] args) {
		
		//IllegalArgumentException
		//Sometimes we do not want to use some values for some parameters.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age = scan.nextInt();
		
		try {
		setAge(age);
		} catch (IllegalArgumentException e) {
			System.out.println("Do not use negative values for ages");
		}
		
		scan.close();
	}
	
	public static void setAge(int age) throws IllegalArgumentException {
		
		if(age<0) {
			throw new IllegalArgumentException();
		} else {
		
		System.out.println("Your age is " + age);
		
		}
		
	}

}
