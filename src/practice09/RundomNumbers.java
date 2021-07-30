package practice09;

import java.util.Arrays;
import java.util.Random;

public class RundomNumbers {

	public static void main(String[] args) {
//		Write a method that generates an single dimensional 
//		Array that consists of x numbers random numbers between 1 and 100. 
//		Method will accept int x as an argument.
		
		System.out.println(Arrays.toString(randomNumbers(5)));

	}
	
	static int[] randomNumbers(int x) {
		Random r = new Random();
		int list1 [] = new int[x];
		for (int i=0; i<x; i++ ) {
			list1[i] = r.nextInt(100);
		}
		
		return list1;
		
	}
	
	

}
