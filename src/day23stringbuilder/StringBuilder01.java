package day23stringbuilder;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		StringBuilder sb2 = new StringBuilder("Java");
		//equals() in StringBuilder returns false even the values are same.
		//Because equals() method in StringBuilder uses "==" in it
 		System.out.println(sb1.equals(sb2));
 		
 		//How can we compare the values of StringBuilders?
 		//1.way: Convert StringBuilders to String then use equals() method
 		System.out.println(sb1.toString().equals(sb2.toString()));//true
 		
 		//2.way: Use compareTo method
 		System.out.println(sb1.compareTo(sb2));//0 ==> StringBuilders have same characters
 		//If you get "0" be sure StringBuilder values are same

	}

}
