package adeneme;

import java.util.Scanner;

public class RepeatedWords {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String arr []= s.split("");
		int len = arr.length;
		int y=1;
		int x=0;
	
		
		for (int i=0; i<len; i++) {
			for (int j=i+1; j<len; j++) {
				if(arr[i].equals(arr[j])) {
					y++;
				}	
			}
			
			for (int k=i; k>0; k--) {
				
					if (arr[i].equals(arr[k-1])) {
						x++;
					}
				
			}
			if(x==0) {
				System.out.println(arr[i]+y);	
			}
				x=0;
				y=1;
				System.out.println();
		}
		
		

	}

}
	
