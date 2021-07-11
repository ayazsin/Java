package day03increment_decrement_operators;

public class HomIncDecVar {

	public static void main(String[] args) {
				
				int num1 =5/2;
				System.out.println(num1);
				
				float num2 = 5f/2f;
				System.out.println(num2);
				
				double num3 = 5d/2d;
				System.out.println(num3);
		
		
		
		
				// 15) Write a program to assign a value of 100.235 to a double variable and 
				//     then convert it to int. Print it on the console.
				double a = 100.235;
				int b = (int)a;
				
				System.out.println(b);
				
				// 16) Write a program to add an integer variable having value 5
				//     and a double variable having value 6.2. Print the sum on the console.
				int c = 5;
				double d = 6.2;
				System.out.println(c+d);
				
				// 17) Create an integer variable and increase it by 1, by using three different ways, 
				//     then type every result on the console.
				int e = 10 ;
				e++;
				e=e+1;
				e+=1;
				System.out.println(e);
				
				//18) Create an integer variable and decrease it by 1, by using three different ways, 
				//    then type every result on the console.
				int f = 20;
				f--;
				f=f-1;
				f-=1;
				System.out.println(f);
	}

}
