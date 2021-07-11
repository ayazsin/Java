package practice05;

import java.util.Scanner;

public class NumberOfJavaAppears {

	public static void main(String[] args) {
		/*Write a method and calculate how many JAVA is typed on the string.
		   * Example intput str="javajavaxxxahmet"
		   */
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string...");
		String s = input.nextLine().toLowerCase();
		java(s);
		dummy(s);
		input.close();

	}
	
	public static void java(String a) {
		int y=0;
		for (int i = 0 ; i<a.length() ; i++) {
			if (a.substring(i).startsWith("java")) {
				y++;
			}
		}
		System.out.println(y);
	}
	
	public static void dummy(String str) {
 		int num=(str.length()-(str.replace("java","")).length())/4;
 		System.out.println("JAVA word is repeated= "+num+" times");
	}

}
