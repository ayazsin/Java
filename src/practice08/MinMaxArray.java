package practice08;

public class MinMaxArray {

	public static void main(String[] args) {
		/* write a method that accepts an integer array as input and prints the minimum
        * and the maximum numbers from given array
        *
        *
        * Input : {3,2,5,4,1,6}
        * Output : min: 1 max : 6
        *
        */
		int s [] = {3,2,5,10,1,6};
		minMaxValue(s);
		

	}
	public static void minMaxValue(int [] s) {
		int y = 0;
		for (int i=0 ; i<s.length; i++) {
				if(s[i]>y) {
					y = s[i];
				}	
		}
		System.out.println("Max = " + y);	
		
		int k = Integer.MAX_VALUE;
		for (int i=0 ; i<s.length; i++) {
				if(s[i]<k) {
					k = s[i];
				}	
		}
		System.out.println("Min = " + k);	
	}
		
	}


