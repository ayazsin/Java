package practice08;

public class SumMultiDimensionalArray {

	public static void main(String[] args) {
		/* Write a method that sums even numbers in the entered Multidimensional array
        INPUT : {{1,3,6},{2,8},{5,7,9,14}}
		 *
		 * OUTPUT :sum of even numbers in array : 30
		 *
		 */
		int sum=0;
		int arr[][] = {{1,3,6},{2,8},{5,7,9,14}};
		for (int i=0; i<arr.length; i++ ) {
			for(int j=0; j<arr[i].length; j++) {
			sum = sum + arr[i][j];
			
		}
		}
		System.out.println(sum);
	}

}
