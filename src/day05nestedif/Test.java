package day05nestedif;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.println ("Entre le prix et le pourcentage S'il vous plaît ?...");

		double prix = input.nextDouble(); //20

		double pourcentage = input.nextDouble(); //20

		System.out.println ( prix-(prix * pourcentage/100)) ; //16
		input.close();
	}

}
