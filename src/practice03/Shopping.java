package practice03;

import java.util.Scanner;

public class Shopping {

	public static void main(String[] args) {
		/*QUESTION
         * Get the number and list price of the product purchased from the user,
         * ask the user if they have a customer card
         *
         * If you have a customer card,20% off if you buy more than 10 products,15% off if you don't.
         * If the customer does not have a card,15% off if he buys more than 10 products,10% off if he does not
         *
         */
		
		Scanner input = new Scanner (System.in);
		System.out.println("Enter price of the product...");
		double price = input.nextInt();	
		System.out.println("Enter number of the product...");
		double unit = input.nextInt();
		System.out.println("Do you have a customer card Y/N...");
		String card = input.next();
		
		if (card.equalsIgnoreCase("Y")) {
			if (unit>10) {
				System.out.println("Sum with %20 discount= " + ((unit*price)*0.8));
			} else {
				System.out.println("Sum with %15 discount= " + ((unit*price)*0.85));
			}
		} else {
			if (unit>10) {
				System.out.println("Sum with %15 discount= " + ((unit*price)*0.85));
			} else {
				System.out.println("Sum with %10 discount= " + ((unit*price)*0.9));
			}
			}
	input.close();	
	}

	}


