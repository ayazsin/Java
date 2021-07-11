package practice07;

public class RemoveStr {

	public static void main(String[] args) {
		/*Write a method with given two strings following,
		 * then see on the console only JAVA
		 * string="bad JAVA"
		 * string2="bad"
		 * OUTPUT =JAVA
		 */
		
		String s = "bad JAVA";
		String k ="bad";
		System.out.println(removeStr(s,k));
		
		

	}
	public static String removeStr(String a, String b) {
		String y=a.replace(b, "").trim();
		
		return y;
	}

}
