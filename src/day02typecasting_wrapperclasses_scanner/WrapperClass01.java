package day02typecasting_wrapperclasses_scanner;

public class WrapperClass01 {

	public static void main(String[] args) {
		
		/*
		 Primitive		Wrapper Class (Non-Primitive)
		   byte				Byte
		   short			Short
		   int			   	Integer *****
		   long				Long
		   float			Float
		   double			Double
		   
		   boolean			Boolean
		   char				Character *****
		 	
		 */

	int a = 11;
	
	Integer b = 12;
	System.out.println(Integer.MAX_VALUE);//2147483647
	System.out.println(Integer.MIN_VALUE);//-2147483648
	System.out.println(Integer.min(120, 23));//23
	System.out.println(Integer.compare(25,64));//-1 because first is smaller
	System.out.println(Integer.compare(64,25));//1 because second is smaller
	System.out.println(Integer.compare(25,25));//0 because they equal
	
	//Create a Short Wrapper Class variable
	//a)Print the max and min values of short data type on the console
	//Use any method and try to understand the logic of the method
	
	Short c = 123;
	Short d = 123;
	System.out.println(Short.MAX_VALUE);//32767
	System.out.println(Short.MIN_VALUE);//-32768
	System.out.println(Short.SIZE);//16 ==> Means c is used 16 bits in the memory
	System.out.println(c.hashCode());//24533 ==> It returns the address of 
									 //the non-primitive data
	System.out.println(c.equals(d));//true
	System.out.println(a + b);
	
	//Autoboxing
	int x = 12;
	Integer y = x;
	System.out.println(x);
	System.out.println(y);
	
	//Unboxing
	Integer z = 23;
	int t = z;
	System.out.println(z);
	System.out.println(t);	

	}

}
