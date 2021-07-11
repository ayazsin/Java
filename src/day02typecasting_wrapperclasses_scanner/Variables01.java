package day02typecasting_wrapperclasses_scanner;

public class Variables01 {

	public static void main(String[] args) {
		
		/*
			If you convert a primitive data type to another, 
			it is called "Type Casting"
		*/
		
		//byte < short < int < long < float < double
		
		//Auto widening
		
		//Type code to convert byte to short
		byte age = 65;
		short newAge = age;
		System.out.println(age);
		System.out.println(newAge);
		
		//Explicit Narrowing
		
		//Type code to convert long to int
		long profit = 2000056;
		int newProfit = (int)profit;
		System.out.println(newProfit);

		//Type code to convert float to short
		float code =1.73f;
		short newCode =(short)code;
		System.out.println(code);//1.73
		System.out.println(newCode);//1
		
		//If the number is not in the range
		short price = 258;
		byte newPrice = (byte)price;
		System.out.println(price);
		System.out.println(newPrice);
		
		/*
		How to do mathematical operations with different data types
		Note:If data types are different Java uses the larger
		data type for the result
		*/
		
		int a = 5;
		double b= 4;
		float e = 4.0f;
		int c= 2;
		int d= 3;
		System.out.println(a+b);//9.0
		
		/*
		If you use same data types, result data type and value will be 
		in the used data type ==>2.5 ==> Decimal part is removed and 
		the result is 2
		*/
		
		System.out.println(a/c);//2
		System.out.println(a/d);//1
		
		//In double decimal you have 16 digits at most
		System.out.println(b/d);//1.3333333333333333
		
		//In float decimal you have 16 digits at most
		System.out.println(e/d);//1.3333334	
	}

}
