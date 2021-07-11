package day18arraysmultidimensionalarrays;

import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		
		/*
		 	Create an array by using short way
		 	Type the code to find the sum of all array elements
		*/
		
		int arr[] = {11, 21, 32};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];	
		}
		System.out.println(sum);
		
		/*
		 	1)Create a String array together with user.
		 	2)Find the multiplication of the lengths of the elements.
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the array...");
		int len=input.nextInt();
		int brr[] = new int [len];
		int i=0;
		int multip=1;
		
		do {
			System.out.println("Enter the element...");
			brr[i]=input.nextInt();
			multip = multip * brr[i];
			i++;
			
		} while (i<brr.length);
		
		System.out.println(multip);
		input.close();
		
		
		
		

	}

}
