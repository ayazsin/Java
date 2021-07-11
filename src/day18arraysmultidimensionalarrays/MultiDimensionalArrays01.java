package day18arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		
		int arr[][] = new int [3][2];
		System.out.println(Arrays.toString(arr));//[[I@626b2d4a, [I@5e91993f, [I@1c4af82c]
		//To print multi dimensional arrays use Arrays.deepTostring()
		System.out.println(Arrays.deepToString(arr));
		
		arr[0][0] = 3;
		arr[0][1] = 2;
		
		arr[1][0] = 11;
		arr[1][1] = -5;
		
		arr[2][0] = 1;
		arr[2][1] = 0;
		
		System.out.println(Arrays.deepToString(arr));//[[3, 2], [11, -5], [1, 0]]
		
		int brr[][] = {{2, 3}, {12, 13, 14, 16, 15}, {7}, {-2, -3, -4}};
		System.out.println(Arrays.deepToString(brr));
		
		/*
		    {{2, 3}, {12, 13, 14}}
		    Type the code to find the sum of the elements
		 */
		
		int crr[][] = {{2, 3}, { 12, 13, 14}};
		int sum=0;
		for (int i=0; i<crr.length; i++) {
			for (int j=0; j<crr[i].length; j++) {
				sum = sum + brr[i][j];
			}
		}
		System.out.println(sum);
		
	
	}

}
