package practice07;

public class NumbersOfEven {

	public static void main(String[] args) {
		/* 
		 * write a method that accepts an integer array as input and 
		 * prints how many even numbers are there in this array?
		* arr={1,5,8,4,6}
		* output=3
		*/
		int [] arr = {1,5,8,4,6};
		System.out.println(evennumbers(arr));
	}
	
	public static int evennumbers(int input[]) {
		int y=0;
		for (int i=0; i<input.length; i++) {
			if (input[i]%2==0) {
				y++;	
			}
		}
		return y;
	}

}
