package practice13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Pangram {
	
	
	public static void main(String[] args) {
		System.out.println(isPangram("The brown quick fox jumps over the lazy dog"));
		Scanner scan = new Scanner(System.in);
		int sum=0;
		
//		List <Integer> list = new ArrayList<>();
//	
//		while (sum<100) {
//			System.out.println("Enter a number");
//			int i=scan.nextInt();
//			list.add(i);
//			sum = sum +i;
//		}
//		
//		sum100(list);
//		
		System.out.println(getSum("aa2aa3"));
		List <Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(1);
		list1.add(2);
		list1.add(2);
		list1.add(3);
		list1.add(3);
		list1.add(3);
		System.out.println(removeDublicated(list1));
		
	}
	
	/*
	 * Write a function to check whether a string is pangram or not assuming 
	 * that the string passed in does not have any punctuation. 
	 * Pangrams are words or sentences containing every letter of the alphabet at 
	 * least once.
	 */

	static boolean isPangram(String s) {
		
		boolean result=false;
		for(char i='a'; i<='z'; i++) {
			String charValue=String.valueOf(i);
			if (!s.contains(charValue)) {
				 result=false;
				 break;
			} else {
				result=true;
			}
		}
		return result;
	}
	
	static boolean isPangram2ndWay (String str) {
		str = str.replace(" ", "").toUpperCase();
		ArrayList <Character> list  = new ArrayList <> ();
		for (int i = 0; i < str.length(); i++) {
			char each = str.charAt(i);
			if (!list.contains(each)&& Character.isLetter(each)) {//(each>='a'&& each<='z')------ (each>=65 && each<=90)
				list.add(each);
			}
		}
		return list.size()=='z' -'a'+1;	
		}
	
	static boolean isPangram1(String str){
        str = str.replace(" ", "").toUpperCase();
        ArrayList<Character> al = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            char each = str.charAt(i);
            //if(!al.contains(each) && each >= 65 && each <= 90){
                //if(!al.contains(each) && each >= 'A' && each <= 'Z'){
                if(!al.contains(each) && Character.isLetter(each)){
                al.add(each);
            }
        }
        return al.size() == 26;
    }
    static boolean isPangram2(String str){
        str = str.replace(" ", "").toUpperCase();
        String[] arr = str.split("");
        List<String> list = Arrays.asList(arr);
        HashSet<String> set = new HashSet<>(list);
        return set.size() == 26;
    }
    
  //2.Write a method where u ask a user to enter a number until the total is 100 or number of trials is equal to 3.
    //EX: 1,2,3 --> You ran out of trials! EX2: 1,2,97 --> You made it! your sum is 100.
    
    static void sum100( List <Integer> list)  {
    	int sum=0;
    	for(int w: list) {
    		sum=w+sum;
    	}
    	
    	if (sum==100 && list.size()<=3) {
    		System.out.println("You made it 100 bravo!!!");
    	} else {
    		System.out.println("Sorry, out of trials");
    	}
    }

     
    static void sumGame(){
        Scanner scan = new Scanner(System.in);
        int sum, trials;
        sum = trials = 0;
        while(sum < 100 && trials < 3){
            System.out.println("Enter a number!");
            sum += scan.nextInt();
            trials++;
            if(trials == 3)
                break;
        }
        if(sum >= 100)
            System.out.println("You made it! Your sum is " + sum);
        else if(trials == 3)
            System.out.println("You ran out of trials!!");
    }
    
  //6.Write a method that reverses a number. Method accepts an integer and returns an int. EX: 123 --> 321
   
    static int reverseNumber(int num){
        String result = "";
        String str = String.valueOf(num);
        if(num < 0){
            str = str.substring(1);
            result += "-";
        }
        result += new StringBuilder(str).reverse().toString();
        return Integer.parseInt(result);
//        String reversed = "";
//        if(num == 0)
//            reversed = "0";
//        if(num < 0) {
//            num *= -1;
//            reversed += "-";
//        }
//        while(num > 0){
//            reversed += num % 10;
//            num /= 10;
//        }
//        return Integer.parseInt(reversed);
        
    }
    
    //7.Write a method that gets any number from a string it gets and returns the total of those number.
    //EX :extractNum("aa2aa3") ==> 2+3 ==> 5.
    
    static int getSum(String s) {
    	int sum = 0;
    	for(int i=0; i<s.length(); i++) {
    		if(Character.isDigit(s.charAt(i))) {
    			sum = sum + Integer.parseInt(s.charAt(i)+"");
    			
    		}
    	}
    	return sum;
    }
    
  //1.Write a method that can remove duplicated values from an Integer ArrayList.
	//EX : ArrayList<Integer>(List.of(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5) ---> [1,2,3,4,5]
    
    static List <Integer> removeDublicated(List <Integer> list) {
    	
    	List <Integer> list1 = new ArrayList<>();
    	for(int w: list) {
    		if (!list1.contains(w)) {
    			list1.add(w);
    		}
    	}
    	
    	return list1;
    }
    
  //9. Create a method the prints the lowercase alphabet
    ​
        static ArrayList<String> alphabet(){
            ArrayList<String> al = new ArrayList<>();
            for(char i = 97; i <= 122; i++){
                String each = i + "";
                al.add(each);
            }
            return al;
        }
    ​
        //Create a method that generates names, Method accepts an int that will set # of names to be stored in the arraylist. It returns an Arraylist

        static ArrayList<String> createNames(int numOfNames){
    ​
            ArrayList<String> al = new ArrayList<>();
            List<String> list = alphabet();
    ​
            for(int j = 1; j <= numOfNames; j++) {
                String name = "";
                int length = new Random().nextInt(25);
                for (int i = 0; i <= length; i++) {
                    int num = new Random().nextInt(26);
                    name += list.get(num);
                }
                al.add(name);
            }
            return al;
        }
    ​
        //Create a method that accepts an arrayList of Strings and return the longest String

        static String findLongest(ArrayList<String> al){
            String result = "";
    ​
            for(String each : al){
                if(each.length() >= result.length())
                    result = each;
            }
            System.out.println(al);
            return result;
        }
    ​
    ​
        











    
   


}

	