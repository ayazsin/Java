package practice04;



public class ReverseNumber {

	public static void main(String[] args) {
		/*
		  Write a program to get a number from console and reverse of this number.
         */

		
	     System.out.println(reverseNumber(123));   
	        
	     
	}
	
	static int reverseNumber(int n) {
		 
		while (n>1) {
        	System.out.print(n%10);
        	n=n/10;
		
	}
		
		return n;
		
}
}
