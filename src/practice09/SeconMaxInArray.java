package practice09;

import java.util.Arrays;



public class SeconMaxInArray {

	public static void main(String[] args) {
		//10. Write a method that accepts an Array of integers and returns the second max.
		int list[] = {2,4,70,23,6};
		System.out.println(secondMax(list));
	}
	
	static int secondMax(int list[]) {
		Arrays.sort(list);
		return list[list.length-2];
		
	}

}
