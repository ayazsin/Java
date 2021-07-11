package practice06;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/*
		  ask to user how many cups of tea you drink daily and how many spoons of sugar
          one spoon sugar is 1.7 gr
          print on the console amount of sugar used annually
        
		 */
		
		Scanner scan = new Scanner(System.in);
        System.out.println("How many tea do you drink for a day? ");
        double t = scan.nextDouble();
        System.out.println("How many sugars do you use for one glass of tea? ");
        double s = scan.nextDouble();
        
        System.out.println("Your daily sugar consumption is "+ (t*s*1.7*365)/1000+" kg");
        scan.close();
	}

}
