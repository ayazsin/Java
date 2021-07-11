package day08stringmanipulation;

public class String01Rev {

	public static void main(String[] args) {
		
		String s1 = "aysea";
		System.out.println(s1.lastIndexOf("u",7));//6 "Ayse T(u)"
		System.out.println(s1.indexOf("e", 2));//3 "s(e) Tugra"

		System.out.println(s1.startsWith("T",5));
		for (int i=0; i<s1.length();i++) {
			if(s1.indexOf(s1.charAt(i))!=s1.lastIndexOf(s1.charAt(i))) {
				System.out.println(s1.charAt(i)+" karakteri tekrar ediyor");
				
			}
		}
		
		if (s1.indexOf('a')!=s1.lastIndexOf('a')) {
			System.out.println('a');
		}
		
		if (s1.indexOf('y')!=s1.lastIndexOf('y')) {
			System.out.println('y');
		}
		
	}

}
