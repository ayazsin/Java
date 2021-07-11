package day05nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter an integer
		 If the integer is less than zero check if it less than -9. If it is less than -9 print "Too small"
		 otherwise "Small"
		 If the integer is greater than zero check if it is greater than 9. 
		 If it is greater than 9 print "Too big" otherwise print "Big"
		 */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer");
		int num = input.nextInt();
		
		if (num<-9) {
			System.out.println("Too Small");
		} else if (num<=0){ 
			System.out.println("Small");
		} else if (num>0 && num<9){
			System.out.println("Big");
		} else {
			System.out.println("Too Big");
			
		}
input.close();
	}

}
