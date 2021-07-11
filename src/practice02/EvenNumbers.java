package practice02;

public class EvenNumbers {

	public static void main(String[] args) {
		/*
		 print even numbers from 50 to 0 but do not use decrement(i--).
		EXAMPLE:
		     INPUT      :
		     OUTPUT  : 100 98 96 94 92 …….2 0
		 */
		
		for (int i=50 ; i>=0; i-=2) {
			System.out.print(i + " ");
		}

	}

}
