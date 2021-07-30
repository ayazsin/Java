package day21foreachloop;
import java.util.Arrays;
import java.util.Scanner;
public class ForEachLoop03 {

	public static void main(String[] args) {
		
		/*
		 Ask user to enter a String and count the vowels(a,e,i,o,u) contained in the String
		 ALiCan ==> The number of a = 2
		 			The number of i = 1
		 */

		int aCounter = 0;
		int eCounter = 0;
		int iCounter = 0;
		int oCounter = 0;
		int uCounter = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String to see how many vowels did you use");
		String str = scan.nextLine();
		
		String ch[] = str.split("");
		System.out.println(Arrays.toString(ch));
		for(String w: ch) {
			
			switch(w) {
				case "a":
					aCounter++;
					break;
				case "e":
					eCounter++;
					break;
				case "i":
					iCounter++;
					break;
				case "o":
					oCounter++;
					break;
				case "u":
					uCounter++;
					break;
			}	
		}
		if (aCounter>0) {
			System.out.println("The number of a = "+ aCounter); 
			}
		if (eCounter>0) {
			System.out.println("The number of e = "+ eCounter); 
			}
		if (iCounter>0) {
			System.out.println("The number of i = "+ iCounter); 
			}
		if (oCounter>0) {
			System.out.println("The number of o = "+ oCounter); 
			}
		if (uCounter>0) {
			System.out.println("The number of u = "+ uCounter); 
			}
		scan.close();	
		}

	

}
