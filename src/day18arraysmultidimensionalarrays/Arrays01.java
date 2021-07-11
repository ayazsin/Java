package day18arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {

	public static void main(String[] args) {
		/*
		 	1) Create an integer array together with user
	  	 	2) Type code to print minimum and maximum elements
	  	 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array to create an integer array...");
		int len=scanner.nextInt();
		
		int arr[] = new int[len];
		int brr[] = new int[len];
		int numOfEl = 0;
		
		do {
			System.out.println("Enter " + (numOfEl + 1) + ". element");
			arr[numOfEl ] = scanner.nextInt();
			brr[numOfEl]=arr[numOfEl];
			numOfEl++;
			
		} while(numOfEl<len);
		
		int crr[] = Arrays.copyOf(arr, len);
		//To get min and max elements from an array use sort()
		/* 
		 	Note: Strings are immutale, it means when you use String methods,
		 	the value of the String does not change
		 	Arrays are mutable, it means Arrays are able to change the arrays as you
		 	can see in the sort() below.
		 */
	
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("Max number is " + arr[len-1]);
		System.out.println("Min number is " + arr[0]);
		
		System.out.println("Original Array before sorting " + Arrays.toString(crr));
		scanner.close();

	}

}
