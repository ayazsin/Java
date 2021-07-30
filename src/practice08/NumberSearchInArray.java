package practice08;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSearchInArray {

	public static void main(String[] args) {
		/* Ask the user for an integer less than 100
        A method that returns to the user whether
        it is in a predefined array or not. write
      *
      * Array={3,5,21,32,34,45,56,57,76,87,95}
      *
      * Input : 5 Output: The number you entered is in the Array
      * Input : 15 Output: The number you entered is not in the Array
      *
      */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = scan.nextInt();
//		int y=0;
		
		int arr[] = {3,5,21,32,34,45,56,57,76,87,95};
		
		if(Arrays.binarySearch(arr, n)>0) {
			System.out.println("The number you entered is in the Array");
		}else {
			System.out.println("The number you entered is not in the Array");
		}
		
//		for(int w : arr) {
//			if (w==n) {
//				System.out.println("The number you entered is in the Array");
//				y=1;
//			}
//		}
//		if(y==0) {
//			System.out.println("The number you entered is not in the Array");
//		}
		scan.close();
	}

}
