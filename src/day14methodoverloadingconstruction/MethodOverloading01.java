package day14methodoverloadingconstruction;

public class MethodOverloading01 {

	public static void main(String[] args) {
		add(6,9);
		add(6.7,9);
		add(4,3.2);
		add(3.2,4.2);
		add(3,6,5);
		add();
		add(3);
		add(3,5);
		add(3,5,6);
		add(3,5,6,7);
		add(3,5,6,7,8);
		
		/*
		  As you see in the examples, I created a method to add 2 values and 
		  I created a different method to add 3 values.
		  If user wants to add 4 values I need one more method but tjis is not sensible
		  because it is endless.
		  
		  For that issue, Java created "varargs", varargs accept any number of values
		 */

	}
	
	public static double add(int a, int b) {
		System.out.println("int + int");
		return a + b;
	}
	
	public static double add(double a, int b) {
		System.out.println("double + int");
		return a + b;
	}

	public static double add(int a, double b) {
		System.out.println("int + double");
		return a + b;
	}
	
	public static double add(double a, double b) {
		System.out.println("double + double");
		return a + b;
	}
	
	public static double add(int a, int b , double c) {
		System.out.println("int + int + double");
		return a + b;
	}
	
	public static int add(int... a) {
		System.out.println("I am using varargs");
		return 1;
		
	}
}
