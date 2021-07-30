package practice08;

public class ReverseSentence {

	public static void main(String[] args) {
		/* Write a Java program that reverse a sentence by using Array
        * (with all spaces and special characters)
        *
        * Input : Coding is greate.
        * Output : .etaerg si gnidoC
        */
		
		String s = "Coding is greate.";
		String arr[] = s.split("");
		
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		

	}

}
