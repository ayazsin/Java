package adeneme;

import java.util.ArrayList;
import java.util.List;

public class RepeatedWords1 {

	public static void main(String[] args) {
		// Find the repeated words in the sentence
		// Input: "I like Java I don't like Phyton"
		/*
		  Output: 2I
		  		  like2
		  		  Java1
		  		  don't1
		  		  Phyton1
		 */
		
		String s = "I like Java I don't like Phyton";
		String list[] = s.split(" ");
		List<String> newlist = new ArrayList<>();
		List<Integer> numlist = new ArrayList<>();
		int counter = 1;
		
		for (int i=0; i<list.length; i++) {
			for (int j=i+1; j<list.length; j++) {
				if(list[i].equals(list[j])) {
					counter++;
				}
			}
			if (!newlist.contains(list[i])) {
				newlist.add(list[i]);
				numlist.add(counter);
			}
			counter=1;
		}
		
		for (String w : newlist) {
			System.out.print(w);
			System.out.println(numlist.get(newlist.indexOf(w)));
			
		}
		

	}

}
