package practice10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SumOfArrays {

	public static void main(String[] args) {

		System.out.println(sumAll(2,3,5,3,6,3,7));
		System.out.println(anagram("read","dear"));
		System.out.println(findMaxs(new int[] {2,3,5,3,6,7,7}));
		System.out.println(findMaxs(generateArraySingleDimension(6)));
		System.out.println(Arrays.toString(sortedArray(generateArraySingleDimension(6))));
		System.out.println(notRepeatedList(new int[] {2,3,5,3,6,7,7}));	
		System.out.println(removeWord(List.of("hi","hey","hi","yo"),"hi"));
	
	}
	
	/*
	 * 16. Write a method that takes two parameters: 
	 * an ArrayList of Strings called wordList, and a String called targetWord. 
	 * Method removes the targetWord from ArrayList.EX :ArrayList("hi","hey","hi","yo")); 
	 *  ----> removeAll(wordList,"hi"); --->["hey","yo"].
	 */
	
	static List<String> removeWord(List <String> al, String word) {
		
		List <String> bl = new ArrayList<>();
		for(String w: al ){
            if(!w.equals(word)) {
                bl.add(w);  
            }
		}
		return bl;
	}
	
	/*
	 * 14. Write a method that accepts an Array and returns the number/s 
	 *     that are not repeated in an ArrayList. Method returns the numbers 
	 *     in aN ArrayList. EX: arr = {1,1,2,2,3,3,4,5}  ---> [4,5]/*
	 */
	
	static List <Integer> notRepeatedList(int[] arr ) {
		ArrayList<Integer> al = new ArrayList<>();
        for(int num : arr){
            int count = 0;
            for(int num2 : arr){
                if(num == num2)
                    count++;
            }
            if(count == 1)
                al.add(num);
        }
        return al;
	}
	
	/*
	 * 11. Write a method that accepts an Array of ints returns the sorted Array in ascending order
	 *     Do not use the sort method.
	 */     	
	static int[] sortedArray(int[] arr) {
		 //{3,2,1} --> 
		
		for (int i = 0 ; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int[] generateArraySingleDimension(int num){
        int[] arr = new int[num];
        for(int i = 0; i < num; i++)
            arr[i] = new Random().nextInt(100);
        return arr;
    }

	/*
	 *  9. Write a method that accepts an Array of integers and returns the max. 
	 * 10. Write a method that accepts an Array of integers and returns the 
	 *     second max.
	 */
	
	static String findMaxs(int[] arr) {
		int max =Integer.MIN_VALUE;
		int secMax =Integer.MIN_VALUE;
		
		for (int num: arr) {
			if (num>max) {
				secMax = max;
				max=num;	
			}else if (num>secMax && num!=max) {
				secMax=num;
			}
		}
		
		return "Max. number is " + max + " Second max. number is " + secMax;
	}
	
	
	/*
	 * 
	 *  7. Write a method that checks to see if the words u pass is Anagram. 
	 *     EX: read and dear  --> true
	 */
	
	static boolean anagram(String s, String y) {
		//toCharArray
		//split()
		String[] arr = s.split("");
		String[] brr = y.split("");
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		return Arrays.equals(arr, brr);
	}
	
	/*
	 * 12. Write a method that accepts an array and returns true 
	 *     if the sum of all 3's in the array is exactly 9. 
	 *     EX: Input : {2,3,5,3,6,3,7} output :true 
	 *     Input : {2,3,4,5,6,3,7} output :false
	 */
	public static boolean sumAll(int... list) {
		int sum = 0;
		
		for (int w: list) {
			if (w==3) {
				sum++;
			}
		}
		return sum == 3 ;
		
		
	}
	
	

}
