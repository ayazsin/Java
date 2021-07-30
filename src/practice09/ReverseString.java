package practice09;



public class ReverseString {

	public static void main(String[] args) {
		 //4. Write a method that accepts a String and returns 
		 //reverse of the same String. EX: java -> avaj
		String s = "java";
		System.out.println(reverseString(s));
	}
	
	static String reverseString(String s)  {
		String snew ="";
		String[] list1 = s.split("");
		for (int i=list1.length-1; i>=0 ; i--) {
			snew = snew + list1[i];
		}
		
		
		return snew;
		
	}

}
