package practice03;

import java.util.Scanner;

public class CountSugar {

	public static void main(String[] args) {
		/*Ask the user how many tea they drink and how many sugars they use a day.
		 * Calculate how many kg of sugar is used in a year and print it.
		1 sugar = 1.7 gr
		Sample= Input:
		        Tea : 10
		        Sugar :2
		    
		        Output : 12.41 kg/year
		*/
		Scanner input = new Scanner (System.in);
		System.out.println("Enter how many glass of tea you drink in a day...");
		double tea = input.nextInt();	
		System.out.println("Enter how many spoon of sugar you use in one glass of tea...");
		double sugar = input.nextInt();
		
		System.out.println((tea*sugar*0.0017*365) + " kg/year");
		
		input.close();
	}

}
