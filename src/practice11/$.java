package practice11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class $ {
	
	//1.A sandwich is two pieces of bread with something in between. 
	//  Print the string that is between the first and last appearance of "bread" 
	//  in the given string, or return string "nothing" if there are not two pieces 
	//  of bread.
	
	static String isSandwich(String s) {
//		if (s.substring(0,5).equals("bread") && s.substring(s.length()-5).equals("bread")) {
//			System.out.println(s.substring(5,s.length()-5));
//		} else {
//			System.out.println("nothing");
//		}
		int first =s.indexOf("bread");
		int second = s.lastIndexOf("bread");
		if(first==second)
			return "nothing";
		return s.substring(first+5,second);
		
	
	}
	
	//2.Print true if the string "java" and "python" appear the same number of times in the given string word.

	static boolean isEqual(String s) {
		int y=0;
		int x=0;
		for (int i=0; i<s.length(); i++) {
			if (s.substring(i).startsWith("java")) {
				y++;
			}
		}
			for (int i=0; i<s.length(); i++) {
				if (s.substring(i).startsWith("phyton")) {
					x++;
				}	
		}
		if (x==y) {
			return true;
		}
		return false;
	}
	
	static boolean isCountSame(String str){//javapythonjava
        int countJava, countPython;
        countJava = countPython = 0;
        str = str.replace(" ", "").toLowerCase();
        for(int i = 0; i < str.length() - 5; i++){
            if(str.substring(i, i + 4).equals("java"))
                countJava++;
            if(str.substring(i, i + 6).equals("python"))
                countPython++;
        }
        if(str.endsWith("java"))
            countJava++;
        return countJava == countPython;
	}
	
	//3.create a two dimensional array of random numbers.
    /**
     *
     * @param outerSize
     * @param innerSize
     * @return a 2 dimensional array of random numbers.
     */
	
	static int[][] ArrayGenerator(int outerSize, int innerSize) {
		int arr[][] = new int [outerSize][innerSize];
		for(int i = 0; i < outerSize; i++) {
			for (int j=0; j< innerSize; j++) {
            arr[i][j] = new Random().nextInt(100);
			}
		}
		return arr;
	}
	
	
	//4.Given a 2d array of ints, find the biggest number(int) in the array and print it.
	
	static int findTheBiggest(int a[][]) {
		int max = Integer.MIN_VALUE;
		for(int[] w:a) {
			for(int z:w) {
				if(z>max) max=z;
			}
		}
		return max;
	}
	
	 //5. Write a method that collects the all positive Armstrong numbers up to the number that is passed in. Armstrong is a number that is equal to the sum of its own digits and each digit being raised to the power of the number of digits. EX: 371 = 3^3 + 7^3 + 1^3 => 371, 1634 = 1^4 + 6^4 + 3^4 + 4^4 == 1634
    /**
     * @param num
     * @return the number of digits
     */
    static int numOfDigits(int num){
        int digits = 0;
        while(num > 0){
            num /= 10;
            digits++;
        }
        return digits;
    }
    static boolean isArmstrong(int num){
        String str = String.valueOf(num);
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            int each = Integer.parseInt(str.substring(i, i + 1));
            sum += Math.pow(each, numOfDigits(num));
        }
        return sum == num;
    }
    static ArrayList<Integer> listOfArmstrong(int num){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i <= num; i++){
            if(isArmstrong(i))
                al.add(i);
        }
        return al;
    }

  /*
   * Write a function to check whether a string is pangram or not assuming that the string passed 
   * in does not have any punctuation. Pangrams are words or sentences containing every letter of the 
   * alphabet at least once. EX: The quick brown fox  jumps over the lazy dog --> true
   */
    
    static boolean pangram(String s) {
    	String arr[] = s.split(" ");
    	int y=0;
    	for(int i=0; i<arr.length; i++) {
    		for (int j=i+1; j<arr.length; j++) {
    			if (arr[i].equals(arr[j])) {
    				y=1;
    				
    				
    			}
    		}
    	}
    	if (y==0) return true;
    	else
    	return false;
    }
    
    
	public static void main(String[] args) {
//		System.out.println(isEqual("phytonjavaphytonjava"));
//		System.out.println(isSandwich("breadsaladsalamibread"));
//		System.out.println(isCountSame("javapythonjavaphyton"));
//		
//		int arr[][] = ArrayGenerator(2,5);
//		System.out.println(Arrays.deepToString(arr));
//		System.out.println(findTheBiggest(arr));
//		System.out.println(listOfArmstrong(100000));
		System.out.println(pangram("The quick quick"));
	}	
		
		
	}


