package practice06;

import java.util.Scanner;

public class Question09 {

	public static void main(String[] args) {
		/* 
		 ask the user for an edge and height of an equilateral triangle
         find the area and perimeter of the triangle
         print on the console
        */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length the side of a triangle");
		int a = scan.nextInt();
		System.out.println("Enter the height the of a triangle");
		int b = scan.nextInt();
		
		int area = (a*b)/2;
		int per = 3 * a;
		
		System.out.println("Area is: " + area + " " + "Perimeter is: " + per);
		scan.close();

	}

}
