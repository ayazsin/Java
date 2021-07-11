package practice02;

import java.util.Scanner;

public class MiddleChar {

	public static void main(String[] args) {
		
		//1.Ask user to enter a word. If the word has odd number of characters 
				//length() of characters
		        //and has 3 or more characters, print the character in the middle of the word.
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string...");
		String s = input.nextLine();
		
		if (s.length()>=3 && s.length()%2==1) {
			System.out.println(s.charAt(s.length()/2));
		}
		input.close();

	}

}
