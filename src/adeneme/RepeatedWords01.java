package adeneme;


import java.util.HashMap;

import java.util.Scanner;

public class RepeatedWords01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter s string");
		String str= scan.nextLine().toLowerCase();
		
		String arr[]=str.split(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		for(String w:arr) {
			if(!hm.containsKey(w)) {
				hm.put(w,1);
			}
			else {
				hm.put(w , hm.get(w)+1  );
			}
			
		}
		System.out.println(hm);
		
		scan.close();
		
	}

}
