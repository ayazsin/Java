package practice05;

import java.util.Scanner;

public class NextThreeNumbers {

	public static void main(String[] args) {
		/*
		 * Write a metod, getting a number from user than get next 3 numbers.
		 * Example=> input number =15
		 *           output       =16,17,18
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		nextnumbers(num);
		scan.close();
	}
	
	
		public static void nextnumbers(int a) {
			System.out.println((a+1)+","+(a+2)+","+(a+3));
		}

}
