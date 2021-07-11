package practice05;

public class Reverse {

	public static void main(String[] args) {
		 /*
		  * write a method using StringBuffer class reverse method, to get reverse any string.
	        
	        */
		reverse("ayse");
	}
	public static void reverse(String str) {
		StringBuffer str1 = new StringBuffer(str);
		System.out.println(str1.reverse());
		
	}
}
