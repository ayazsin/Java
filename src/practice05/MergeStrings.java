package practice05;

import java.util.Scanner;

public class MergeStrings {

	public static void main(String[] args) {
		/*Write a method to merge given two strings char by char.
		 * Example string1="jv",string2="aa",
		 *         output=java
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first string...");
		String s = input.next();
		System.out.println("Enter second string...");
		String y = input.next();
		mergeString(s,y);
		input.close();
		
		}
	public static void mergeString(String a, String b) {
		for (int i=0; i<a.length(); i++) {
			System.out.print(a.charAt(i)+""+b.charAt(i));
		}
	}
}
