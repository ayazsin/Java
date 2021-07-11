package practice02;

import java.util.Scanner;

public class ChangeMailAdd {

	public static void main(String[] args) {
		// ask user to enter an e-mail address
        // then if it contains "hotmail" replace it with "gmail"
        // e.g: johnbrown@hotmail.com ==> johnbrown@gmail.com

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your mail address...");
		String s = input.nextLine();
		if (s.contains("hotmail")) {
			s = s.replace("hotmail", "gmail");
		}
		
		System.out.println(s);
	input.close();
	}
}
