package day22dateaccessmodifiersstringbuilders;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		// How to create a String by using "StringBuilder Class"
		// 1.Way:
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1);//Empty String
		System.out.println(sb1.capacity());//16 is the default capacity
		
		sb1.append("Ali Can");
		sb1.append(" is a student ");
		
		System.out.println(sb1);//Ali Can is a student 
		
		// 2.Way
		StringBuilder sb2 = new StringBuilder("Veli Han is a parent");
		System.out.println(sb2);
		
		//3.Way
		StringBuilder sb3 = new StringBuilder(5);//If you are sure about the length you can define it here
		sb3.append("Java");
		
		System.out.println(sb3.capacity());//5 <== It returns the capacity of the StringBuilder field
		System.out.println(sb3.length());//4 <== It returns the number of characters
		
		//StringBuilder Methods
		StringBuilder sb4 = new StringBuilder("Java");
		
		//1. Use append() in method chain
		sb4.append("x").append("y").append("z");
		System.out.println(sb4);//Javaxyz
		
		//2. 
		sb4.append("$12.99",1,6); //If you want to add some characters from a String use append() method like that
		System.out.println(sb4);
		
		System.out.println(sb4.charAt(5));//y
		
		sb4.delete(4,7);
		System.out.println(sb4);//Java12.99
		
		sb4.deleteCharAt(6);
		System.out.println(sb4);//Java1299
		
		StringBuilder sb5 = new StringBuilder("Java1299");
		StringBuilder sb6 = new StringBuilder("Java1299");
		
		//StringBuilder equals() method is different from String equals() method.
		//StringBuilder equals() method return true for just same objects.
		//If you use StringBuilder equals() method with different objects whose values are same, you will get false. 
		System.out.println(sb5.equals(sb6));//false
		
		System.out.println(sb4.indexOf("1"));//4
		
		sb4.insert(3, "CCCCCC"); //3 is the starting index
		System.out.println(sb4);//JavCCCCCCCa1299
		
		sb4.insert(11, "Program", 1, 4);
		System.out.println(sb4);//JavCCCCCCa1rog299
		
		sb4.replace(3, 9, "***");
		System.out.println(sb4);//Jav***a1rog299
		
		//reverse() method is used to reverse a string
		sb5.reverse();
		System.out.println(sb5);//9921avaJ
		
		sb4.setCharAt(7, '9');
		System.out.println(sb4);//Jav***a9rog299
		
		System.out.println(sb4.subSequence(3, 6));//***
		System.out.println(sb4);//Jav***a9rog299
		
		sb4.trimToSize();//Attemps to reduce storage used for the character sequence.
		
		StringBuilder sb = new StringBuilder("StringBuilder");
		System.out.println(sb.delete(3, 6).toString() + " - " + sb.length());
		

		
		
 		
		
		
		
		
		
		
		
		
		

	}

}
