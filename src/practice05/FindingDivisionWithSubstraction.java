package practice05;

public class FindingDivisionWithSubstraction {

	public static void main(String[] args) {
		/*
         * Interview Question :
         *
         *
         * write a return method that can divide two numbers without division operator
         * and prints quotient and remainder
         *
         * Input : number= 44 and divisor=5
         * Output : Quotient=8 Remainder=4
         */
		
		calc(40,5);


	}
	public static void calc(int a, int b) {
		int y=0;
		
		do  {
			 a=a-b;
			 y++;		 
		 } while (a>b);
		
		System.out.println("Quotient=" + y + " Remainder=" + a%b);
	}

}
