package practice06;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		/* ask the user about one side of the square
		  find the area and perimeter of the square
		  print on the console
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter one side of square..");
		double side = scan.nextDouble();
		
		double area = Math.pow(side, 2);
		double perimeter = side*4;
		
		System.out.println("The area= " + area);
		System.out.println("The perimeter= " + perimeter);
		
		scan.close();
		
		

	}

}
