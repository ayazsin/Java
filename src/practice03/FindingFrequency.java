package practice03;

import java.util.Scanner;

public class FindingFrequency {

	public static void main(String[] args) {
		/*
         * Interview question
         *
         * write a method that can find the frequency of characters (with case
         * sensitivity)
         *
         * Input = AAABBCDD output = A3B2C1D2
         */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the string");
		String s = input.next();
		int y = 0;
		String output = "";
		
		
		for (int i=0; i <s.length(); i++) {
			for (int j=i; j<s.length(); j++) {
				if(s.substring(i,i+1).equals(s.substring(j,j+1))) {
				y++;	
				}
			} 
				if (!output.contains(s.substring(i,i+1))) {
					output = output + s.charAt(i) + y ;
				
			}
				y = 0;	
		}
		System.out.println(output);
		input.close();
	}

}
