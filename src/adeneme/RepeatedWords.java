package adeneme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatedWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("ENTER A STRING");
		String s = input.nextLine();
		String list[] = s.split(" ");
		List <String> list2 = new ArrayList<>();
		List <Integer> numlist = new ArrayList<>();
		int len = list.length;
		int y=1;
//		int x=0;
		
		for (int i=0; i<len; i++) {
			for (int j=i+1; j<len; j++) {
				if(list[i].equals(list[j])) {
					y++;
				}
			}
			if (!list2.contains(list[i])) {
				list2.add(list[i]);
				numlist.add(y);
			}
			
			y=1;	
		}
		
		for(String w : list2) {
			System.out.print(list2.get(list2.indexOf(w)));
			System.out.println(numlist.get(list2.indexOf(w)));
		}
//	
//		for (int i=0; i<list2.size(); i++) {
//			System.out.print(list2.get(i));
//			System.out.println(numlist.get(i));
//			
//		}
	
		
//		for (int i=0; i<len; i++) {
//			for (int j=i+1; j<len; j++) {
//				if(arr[i].equals(arr[j])) {
//					y++;
//				}	
//			}
//			for (int k=i; k>0; k--) {
//				
//					if (arr[i].equals(arr[k-1])) {
//						x++;
//					}
//				
//			}
//			if(x==0) {
//				System.out.println(arr[i]+y + " ");	
//			}
//				x=0;
//				y=1;
//				
//		}
		
	input.close();

	}

}
	
