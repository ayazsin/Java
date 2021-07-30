package adeneme;

public class ObebOkek {

	public static void main(String[] args) {
//		Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
//
//		Input :
//
//		30 and 40
//
//		Expected OutPut:
//
//		GCD for 30 and 40 = 10
//
//		LCM for 30 and 40 = 120
		int num1=30;
		int num2=40;
		int i=2;
		int j=2;
		int sum=1;
		int sum2=1;
		int multi=num1*num2;
		
		do {
			if(num1%i==0 && num2%i==0) {
				sum = sum*i ;
			}
			i++;
		} while (i<num1/i);
		
		do {
			if(num1%j==0 || num2%j==0) {
				sum2=sum2*j;
				if(num1%j==0) {
					num1 = num1/j;
				}
				if(num2%j==0) {
					num2 = num2/j;
				}
			} else {
				j++;
			}
		} while (j<multi);
		
		System.out.println("GCD for 30 and 40 = "+sum);
		System.out.println("LCM for 30 and 40 = "+sum2);


	}

}
