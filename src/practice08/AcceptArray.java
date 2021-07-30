package practice08;

import java.util.Arrays;
public class AcceptArray {


	
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				
			//  ! Create a static void method: acceptArray
				//  It should take one String array as parameter
				//  ! and print them as an array
				//  ! e.g String[] array = { "sam", "john", "tom" };
				//  ! acceptArray(array);
				//  ! Then output: [sam,john,tom]
				//  ! Create another static method :acceptArray2
				//  It should take one String array as parameter
				//  ! and print each element in the array
				//  ! e.g String[] array = { "sam", "john", "tom" };
				//  ! acceptArray2(array);
				//  ! Then output: sam john tom
				
				String[] array = { "sam", "john", "tom" };
				
				acceptArray(array);
				acceptArray2(array);
			}
			
			
			public static void acceptArray(String[] array) {
				
				System.out.println(Arrays.toString(array));
				
				
			}
			
			
			public static void acceptArray2(String[] array) {
				
//				for(int i=0;i<array.length;i++) {
//					
//					System.out.print(array[i]+" ");
//				}
				
				for(String w:array) {
					System.out.print(w+" ");
				}
				
				
			}
			
			
		

	}

