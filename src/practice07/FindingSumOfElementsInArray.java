package practice07;

public class FindingSumOfElementsInArray {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an array as parameter and returns sum off all
		 * elements in the array
		 *
		 * Then print the result, in the main method
		 *
		 * Eg : input : {4,6,8,10}; output: 28
		 *
		 */
//NOTE with return type put sum line 19 
		int[] arr = {4,6,8,10};
		sumofelements(arr);

	}
	
	public static void sumofelements(int input[]) {
		int sum = 0;
		for (int i=0; i<input.length; i++) {
			sum = sum + input[i];
		}
		System.out.println(sum);
		
		
	}

}
