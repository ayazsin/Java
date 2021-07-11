package day05nestedif;

import java.util.Scanner;

public class Nestedif01 {

	public static void main(String[] args) {
		/*
		 As user to enter his/her age gender(m==>Male, F==Female)
		 If the age is negative, and gender is different from 'M' and 'F' give error message.
		 If the age is greater than 65 and gender is male print "Retired" otherwise "Need to work"
		 If the age is greater than 60 and gender is female print "Retired" otherwise "Need to work"
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your gender...(M/F)");
		char gender = scan.next().toUpperCase().charAt(0);
		
		if (gender != 'M' && gender != 'F' ) {
			System.err.println("You made typing error");
		} else {
					System.out.println("Enter your age...");
					int age = scan.nextInt();
					
					if (age<0 || age>120) {
						System.err.println("You entered wrong age");
					} else if ((age >65 && gender == 'M')||(age>60 && gender=='F')) {
						System.out.println("Retired");
					} else {
						System.out.println("Need to work");
					}
				}
		scan.close();
	}
}
