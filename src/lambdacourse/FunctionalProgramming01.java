package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming01 {
	
	/*
	 	1)Lambda is Functional Programming
	 	2)Functional Programming was added to Java in Java 8 we using just
	 	  Structured Programming but after Java 8 we are able to use both Functional
	 	  Programming and Strucctured Programming
	 	3)Structured Programming focuses on "How to do" most of the times, Functional 
	 	  Programming focused "What to do"
	 	4)Functional Programming is used with Collections, and Arrays  		
	 */

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(8);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        printElStructured(l);
        System.out.println();
        printElFunctional(l);
        System.out.println();
        printEvenNumbersStructured(l);
        System.out.println();
        printEvenFunctional(l);
        System.out.println();
        printSquareOfOdds(l);
        System.out.println();
        printCubeofDistinctOdds(l);
        System.out.println();
        printSumofSquaresDistinctEvens(l);
        printCubesofDistinctEvens(l);
        printMaxValue(l);
        printMinValue(l);
        printMaxValue(l);
        printMinValueAfter7(l);
        printMinValueAfter7_2(l);
        getHalfOfDistinctElReversed(l);
        
     
	}
	
	//1)Create a method to print the list elements on the console in the same 
	//line with a space between two consecutive elements.(Structured)
	public static void printElStructured(List<Integer> l) {
		for(Integer w : l) {
			System.out.print(w + " ");
		}
		
	}
	
	//1)Create a method to print the list elements on the console in the same 
		//line with a space between two consecutive elements.(Funtional)

	public static void printElFunctional(List<Integer> l) {
		l.stream().forEach(t->System.out.print(t+ " "));
	}
	
	//2)Create a method to print the even list elements on the console in the same 
	//line with a space between two consecutive elements.(Structured)
	
	public static void printEvenNumbersStructured(List<Integer> l) {
		for(Integer w : l) {
			if (w%2==0) {
			System.out.print(w + " ");
			}
		}
		
	}
	//2)Create a method to print the even list elements on the console in the same 
		//line with a space between two consecutive elements.(Fuctional)
	public static void printEvenFunctional(List<Integer> l) {
		l.stream().filter(t->t%2==0).forEach(t->System.out.print(t+ " "));
	}
	
	//3)Create a method to print the square of odd list elements on the console 
	//in the same line with a space between two consecutive elements.
	public static void printSquareOfOdds(List<Integer> l) {
		l.stream().filter(t->t%2==1).map(t->t*t).forEach(t->System.out.print(t+" "));
	}
	
	//4)Create a method to print the cube of distinct odd list elements on the console 
	//in the same line with a space between two consecutive elements.
	public static void printCubeofDistinctOdds(List<Integer> l) {
		l.stream().filter(t->t%2==1).distinct().map(t->(int)Math.pow(t, 3)).forEach(t->System.out.print(t+" "));
	}
	//5)Create a method to calculate the sum of the squares of distinct even elements
	public static void printSumofSquaresDistinctEvens(List<Integer> l) {
		int sum=l.stream().distinct().filter(t->t%2==0).map(t->(int)Math.pow(t, 2)).reduce(0,(t,u)->t+u);
		System.out.println("The sum of the squares of even distinct element is " + sum);
	}
	
	//6)Create a method to calculate the product of the cubes of distinct even elements
	public static void printCubesofDistinctEvens(List<Integer> l) {
		int product=l.stream().distinct().filter(t->t%2==0).map(t->(int)Math.pow(t, 3)).reduce(1,(t,u)->t*u);
		System.out.println("The product of the cubes even distinct element is " + product);
	}
	
	//7)Create a method to find the maximum value from the list elements
	//1.way:
	public static void printMaxValue(List<Integer> l) {
		int max=l.stream().distinct().sorted().reduce(0, (t,u)->u);
		System.out.println("The max value is " + max);
	}
	
	//2.way
	public static void printMaxValue2(List<Integer> l) {
		int max=l.stream().reduce(Integer.MIN_VALUE, (t,u)->t>u ? t: u);
		System.out.println("The max value is " + max);
	}
	
	//8)Create a method to find the maximum value from the list elements
		//1.Way
			public static void printMinValue(List<Integer> l) {
			int min = l.stream().sorted().findFirst().get();
			System.out.println("The min value is " + min);
		}
		//2.Way
			public static void printMinValue2(List<Integer> l) {
				int min=l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(0, (t,u)->u);
				System.out.println("The min value is " + min);
			}
		//9)Create a method to find the minumum value which is greater than 7 and even
		//1.Way	
			public static void printMinValueAfter7(List<Integer> l) {
				int min=l.stream().filter(t->t>7 && t%2==0).reduce(Integer.MAX_VALUE, (t,u)->t<u ? t: u);
				System.out.println("The min value is " + min);
			}
			
		//2.Way	
			public static void printMinValueAfter7_2(List<Integer> l) {
				int min= l.stream().sorted().filter(t->t>7 && t%2==0).findFirst().get(); //Use findFirst() together with get().
				System.out.println("The min value is " + min);
			}
			
		//10)Create a method to find the half of the elements which are distinct and 
		//greater than 5 in reverse order from the list.
			
			public static void getHalfOfDistinctElReversed(List<Integer> l) {
				List<Integer> resultList = l.stream().distinct().filter(t->t>5).map(t->t/2).
				sorted(Comparator.reverseOrder()).collect(Collectors.toList()); 
				System.out.println("Half of the elements " + resultList);
			}
			
			
			
			
			
}
