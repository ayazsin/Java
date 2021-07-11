package practice04;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		/*
         * Ask the user for a String and a sentences
         * Find and print occurrence of String in sentences.
         * (without case sensitivity)
         *
         * sentences =“hihihi” String=“hi” output=“There are 3 "hi"s in hihihi "
         * sentences =“I am coming” String=“com” output ="there is 1 “com” in sentences "
         */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentences...");
		String s = input.nextLine();
		System.out.println("Enter a string...");
		String w = input.next();
		
		int y=0;
	
		
		for (int i=0; i<s.length(); i++) {
			if (s.substring(i).toLowerCase().startsWith(w.toLowerCase())) {
				y++;
			}
			}
		
		if(y==0) {
			System.out.println("There is no " + w + " in the sentences");
		} else if (y==1) {
			System.out.println("There is one" + w + " in the sentences");
		} else {
		System.out.println("There is " + y + " times " + w + " in the sentences");
	
	}
		input.close();
	}
}
