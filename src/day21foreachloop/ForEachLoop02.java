package day21foreachloop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ForEachLoop02 {

	public static void main(String[] args) {
		/*
		 Ask user to enter 5 full names (No middle name)
		 Get the initials of the first and the last name, concatenate them and store in a list
		 Print the list on the console
		 Example; if user enters "Ali Can", "Veli Han", "Kemal Mert"==>[AC, VH, KM]
		 */
		
		Scanner scan = new Scanner(System.in);
		//Create a list and add the names which are coming from user
		List<String> names =new ArrayList<>();
		
		int i=0;
		do {
			System.out.println("Enter a full name");
			names.add(scan.nextLine());
			i++;
		} while (i<5);
		System.out.println(names);
		
		List<String> initials = new ArrayList<>();
		
		for(String w : names) {
			initials.add(w.substring(0,1) + w.charAt(w.indexOf(" ")+1));
		}
		
		System.out.println(initials);
		scan.close();
	}

}
