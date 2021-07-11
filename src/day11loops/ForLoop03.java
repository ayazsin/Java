package day11loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		/*
	 	Nested loops 
		*/
	for(int i=1; i<4; i++) {
		for(int j=5; j<7; j++) {
			System.out.println(i + " - " + j);
		}
	}
		
		/*
	 	Ask user to enter the number of rows and the number columns then
	 	draw rectangle by using *	
	 	Example: row = 3, column=4
	 	         * * * *
	 	         * * * *
	 	         * * * *
	 	*/
	
	Scanner input = new Scanner (System.in);
	System.out.println("Enter the number of rows...");
	int r = input.nextInt();	
	System.out.println("Enter the number of columns...");
	int c = input.nextInt();
	
	for (int i = 1; i <= r ; i++ ) {
			for (int j=1 ; j <= c  ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	input.close();
	}
	

	}


