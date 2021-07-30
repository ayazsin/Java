package practice09;



public class RemoveDublicatedNumbers {

	public static void main(String[] args) {
		//2. Write method that accepts a String and removes all duplicate from String. 
		//EX : aaabbc --> abc
		
		String a = "aaabbc";
		System.out.println(removedublicate(a));

	}
	
	static String removedublicate(String s) {
		
		String[] list1 = s.split("");
		String n="";
		for (String w:list1) {
			if (n.contains(w)) {
				continue;
			}
			n=n+w;
		}
		return n;
		
		
	}

}
