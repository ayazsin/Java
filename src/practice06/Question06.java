package practice06;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		
		/* ask user to enter a integer number
         find the sum of digitnumber
         example 345=12
         */
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("please enter the a integer number");
		int number=scan.nextInt();
		
		int a=0;
		int sum=0;      //   102/10=10
		while(number>0) {
			
			a=number%10;
			sum=a+sum;
			
			number=number/10;
			
			
		}
		System.out.println("sum of digit "+sum);
		scan.close();

	}

}
