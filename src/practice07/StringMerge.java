package practice07;

public class StringMerge {

	public static void main(String[] args) {
		/*
		 * Write a method with given two strings and get on the console 
		 * Javaisagoodlanguage
	     * str="Javalanguage"
	     * str1="isagood"
	    */
		String str="Javalanguage";
		String str1="isagood";
		
		System.out.println(StringMerg(str,str1));
		
		

	}

	private static String StringMerg(String str, String str1) {
		String all = str.substring(0,3)+str1+str.substring(4);
		return all;
	}

}
