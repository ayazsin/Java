package practice06;

import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer");
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		
		System.out.println("Before swap : " + a +","+ b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("After swap  : " + a +","+ b);
		scan.close();

	}

}
