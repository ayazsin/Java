package practice01;

import java.util.Scanner;

public class SalaryBonus {

	public static void main(String[] args) {
		/*
	     * A company decided to give bonus of 5% to employee if his/her 
	     * year of service is more than or equal 5 years.
	     * Ask user for their salary and year of service and print the net bonus amount.
	     * Example: Input= 4 year service
	     *               salary: 4000
	     *          Output= 0
	     */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your salary and years of the experience... ");
		int s = input.nextInt();
		int y = input.nextInt();
		
		if (y>=5) {
			System.out.println("your bonus " + s*0.05 + " $");
		} else {
			System.out.println("no bonus");
		}
		
	input.close();
	}

}
