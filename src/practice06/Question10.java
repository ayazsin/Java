package practice06;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		/*
		 Write a program in Java to input 5 numbers from keyboard and find their sum and average.
EXAMPLE:
      INPUT     : 
Input the 5 numbers :                                                           
1                                                                               
2                                                                               
3                                                                               
4                                                                               
5             
   OUTPUT :
The sum of 5 no is : 15                                                         
The Average is : 3.0
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 5 numbers");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		double e = scan.nextDouble();
		
		System.out.println("The averadge is:  "+ (a+b+c+d+e)/5);
		System.out.println("The sum is: " + (a + b + c + d + e));
		
		scan.close();

	}

}
