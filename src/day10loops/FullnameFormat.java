package day10loops;

import java.util.Scanner;

public class FullnameFormat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your fullname...");
		String s = input.nextLine();
		
		int i = s.indexOf(" ");
		System.out.println(s.substring(0,1).toUpperCase()+s.substring(1,i).toLowerCase()+" "+ s.substring(i+1).toUpperCase());
		
		input.close();
	}

}
