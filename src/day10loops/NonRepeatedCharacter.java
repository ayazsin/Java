package day10loops;

import java.util.Scanner;

public class NonRepeatedCharacter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string...");
		String s = input.nextLine();
		
		for (int i = 0 ; i < s.length() ; i++) {
			
			if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
				System.out.print(s.charAt(i));
			}
		input.close();	
		}

	}

}
