package day24multithreadsyncencapsulation;

import java.util.Arrays;

public class Varargs01 {

	public static void main(String[] args) {
		/*
		 * 1)Behind the "varargs", Java uses arrays. Because of that, varargs behaves 
		 * like arrays with some differences
		 * 2)You cannot use more than one varargs
		 * 3)It should be last parameter everytime
		 * 4)"..." can be put just after data type(int... a) or just before varargs
		 * name(int... a). Others do not work
		 * 
		 * Note: If you need same method to use with different number of parameters, use "varargs"
		 */
	
		System.out.println(add(5,7,6,9,10));
		

	}
	
//	public static int add() {
//		return 3+5;
//	}
//	public static int add(int a, int b) {
//		return a+b;
//	}
//	
//	public static int add(int a, int b, int c) {
//		return a+b+c;
//	}
	
	public static String add(int...a ) {
		
		int sum = 0;
		for (int w: a) {
			sum = sum + w;
		}
		return Arrays.toString(a);
	}
	
	

}
