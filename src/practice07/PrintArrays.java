package practice07;

import java.util.Arrays;


public class PrintArrays {

	public static void main(String[] args) {
		 //  ! Create a static method name: acceptString
		//  It should accept 3 strings as parameter
		//  ! and print them as an array
		//  ! e.g. String[] array = { "sam", "john", "tom" };
		//  ! acceptString(“sam”,”john”,”tom”);
		//  ! Then output: [sam,john,tom]
		String a = "sam";
		String b = "john";
		String c = "tom";
		acceptString(a,b,c);
	
	}
	
	public static void acceptString(String a, String b, String c) {
		String array[]= {a,b,c};
		
		System.out.println(Arrays.toString(array));
	}
		
		
		
	}


