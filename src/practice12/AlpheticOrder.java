package practice12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlpheticOrder {
	
	public static void main(String[] args) {
		
		String arr[][]= {{"John","Brad","Fox"},{"Lee","Ali"},{"Suzan"}};
		System.out.println(alpheticOrder(arr));
		
		String[] brr = {"John","Brad","Angel","Sofia","Emily"}; 
		String[] crr = {"sofia","brad","grace","emily","hazel"};
		System.out.println(commonElements(brr,crr));
		
		System.out.println(repeatedLetters("animal catcher"));
	}
	
   /*
 	* write a return method that accepts an Multidimensional Array as input
    * Puts all element in a new list
    * and prints all elements in natural order
    *
    * Eg : Input : {{John,Brad,Fox},{Lee,Ali},{Suzan}}
    *       Output:[Ali, Brad, Fox, John, Lee, Suzan]
    */

	static List <String> alpheticOrder(String arr[][]) {
		
		List<String> list = new ArrayList<>();
		
		for (int i = 0 ; i<arr.length; i++) {
			for (int j = 0; j<arr[i].length; j++) {
				list.add(arr[i][j]);		
			}	
		}	
		Collections.sort(list);
		return list;
	}
	
	/* write a program to find the common elements between two String Arrays
     * (without case sensitivity)
     *
     * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
     *
     * Output : [sofia,brad,emily]
     */
	
	static List<String> commonElements(String arr[], String brr[]) {
		List<String> list = new ArrayList<>();

		for(int i=0; i<arr.length; i++) {
			for (int j=0; j<brr.length; j++) {
				if(arr[i].equalsIgnoreCase(brr[j])) {
					list.add(arr[i]);
					break;
			}	
			}
		}
		return list;
	}
	
	  /*
	   * Write a program that finds the repeating letters in the text we receive from the user.
       *
       * Step 1: Let's ask the user to enter some text.
       * Step 2: Let's compare all letters with other letters.
       * Let's use nested for loops for this.
       * Step 3: Let's compare the letters in the inner for loop.
       * If there is equality, it means repeating. Let's print it to the screen.
       *
       * Hint : When printing repetitive letters on the screen, be careful not to print them several times.
       * create a List<Character> Pre-FoundLetters and insert the letters you find.
       * If the letter is already printed on the screen, do not print it on the screen.
       *
       * Hint 2: To not print the space character " " (letter != ' ') if it is not equal to space
       * You can use the * condition.
	   */
	
	static String repeatedLetters(String s) {
		String s1 = "";
		for (int i=0; i<s.length(); i++) {
			for (int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j) && s.charAt(i)!=' ') {
					if (!s1.contains(s.substring(i,i+1))) {
						s1 = s1 + s.substring(i,i+1);
					}
					
				}
			}
		}
		return s1;
		
	}
}
