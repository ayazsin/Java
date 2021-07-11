package practice01;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		
		/*
			Ask user to enter two numbers Show them e menu of operation signs and ask
			them to choose one. "Addition: 1 , Subtraction : 2 , Multiplication : 3,
			Division : 4 Print the result on the console
				  
			EXAMPLE: INPUT: Num1 : 23 Num2 : 55 OUTPUT : Result : 78
		*/
				
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any number");
		double num1=scan.nextDouble();
				
		System.out.println("Please enter second number");
		double num2=scan.nextDouble();
				
		System.out.println("Which operator do your prefer?\n1 for addition\n2 for subtraction\n3 for multiplication\n4 for division");
		int operation=scan.nextInt();
		        
			switch (operation) {
				case 1:
					System.out.println("The result of Addition Operation is"+" "+(num1+num2));
					break;
				case 2:
					System.out.println("The result of Subtraction Operation is"+" "+(num1-num2));
					break;
				case 3:
					System.out.println("The result of Multiplication Operation is"+" "+(num1*num2));
					break;
				case 4:
					System.out.println("The result of Division Operation is"+" "+(num1/num2));
					break;
				default:
					break;
				}
		scan.close();	
		}
	}

