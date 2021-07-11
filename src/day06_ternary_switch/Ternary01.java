package day06_ternary_switch;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer..");
		int x = scanner.nextInt();
		
		//        condition   ?  Code will be executed for true condition :  Code will be executed for false condition
		//String a =   x<5      ?                   "True"                  :                "False";
		
		//String result = x%2 == 0 ? x + " is even..." : x + " is odd";
		
		
		
		String result = x++ > 5 ? "true" : x + "";
		
		System.out.println(result);
		
		scanner.close();
	}

}
