package practice07;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop04 {

	public static void main(String[] args) {
		
		/*
		 Create 2 integer lists and print the common elements on the console
		 If there is no any common element print "No common elements" on the console
		 Example: list1 = [1, 3, 2, 4] list2 = [5, 2, 6, 7, 4] output = [2, 4]
		 */
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(11);
		list1.add(12);
		list1.add(13);
		list1.add(14);
		list1.add(15);
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>();
		list2.add(7);
		list2.add(14);
		list2.add(11);
		list2.add(14);
		list2.add(15);
		list2.add(17);
		System.out.println(list2);
		
		List<Integer> commonEl = new ArrayList<>();
		
		for (int w :list1) {
			for(int t : list2) {
				if(w==t) {
					if(!commonEl.contains(w)) {
						commonEl.add(w);
					}
				}
			}
		}
		if (commonEl.isEmpty()) {
			System.out.println("No common elements");
		} else {
		System.out.println(commonEl);
		}

	}

}
