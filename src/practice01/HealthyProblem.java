package practice01;

import java.util.Scanner;

public class HealthyProblem {

	public static void main(String[] args) {
		
		/*
		 * Write a Java program that accepts name,surname, age, weight, height;
		 * Calculates BMI(Body Mass Index) and prints the user’s status like that;
		 * John CARPENTER is 25 years old, his height is 170.5 cm and his weight is 80.24 kg. He is HEALTHY because his BMI=24.7
		 * formula; bmi = weight / (height * height / 10000);
		 * bmi less than or equal 20 is weak,less than or equal 25 is healty,less than or equal 30 is fat, the other option is obese
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your name, surname, age, weight and height in order");
		String name = input.nextLine();
		String surname = input.nextLine().toUpperCase();
		int age = input.nextInt();
		double weight = input.nextDouble();
		double height = input.nextDouble();
		
		double bmi = weight/(height*height/1000);
		String result;
		if(bmi<=20) {
			result = "weak";
		} else if (bmi<=25) {
			result = "healthy";
		} else if (bmi<=30) {
			result = "fat";
		} else {
			result = "obese";
		}
		
		System.out.println(name + " " + surname + " is " + age + " years old, his height is " 
		+ height + " cm and his weight is " + weight + " kg. He is " + result + 
		" because his BMI is " + bmi);
		
	input.close();	
	}

}
