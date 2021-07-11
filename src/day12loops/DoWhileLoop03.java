package day12loops;

public class DoWhileLoop03 {

	public static void main(String[] args) {
		/*
		 For the String "1234_?!abcdef", type a code to count the number of letters, 
		 the number of digits and the number of others by using do-while loop
		*/
		
		String s = "1234_?!abcdef";
		int i = 0;
		
		int d = 0; //digitcounter
		int l = 0; //lettercounter
		int o = 0; //othercounter
		
		do {
			if (s.charAt(i)>='a' && s.charAt(i)<='z') {
				l++;
			} else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				d++;
			} else {
				o++;
			}
			i++;
			
		} while(i<s.length());
     
		System.out.println("Letters: " + l);
		System.out.println("Digits: " + d);
		System.out.println("Others: " + o);
		
	}

}
