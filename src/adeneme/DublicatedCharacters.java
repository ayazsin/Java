package adeneme;

import java.util.Arrays;

public class DublicatedCharacters {

	public static void main(String[] args) {
		String s = "Javaisalsoeasy";
		String y ="";
		for (int i=0; i<s.length(); i++) {
			for (int j=i+1; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)) {
					if (!y.contains(s.substring(i,i+1))) {
					y = y + s.charAt(i);
					}	
				}
			}
		}
		char arr[]=y.toCharArray();
		System.out.println(Arrays.toString(arr));
	}
	
}


