package lambdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming02 {
	
	/*
	 		Method References: Class Name :: Method Name without parenthesis
	 		Example ==> 	   String	  :: length
	 						   ArrayList  :: size
	 */

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        printElFunctional(l);
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
        printMinValue2(l);
        printMinValueAfter7(l);
        getHalfOfDistinctElReversed(l);
        

	}
	
	//1)Create a method to print the list elements on the console in the same 
	//line with a space between two consecutive elements.(Method Reference)
	//If Java has any method we prefer to use it, if Java does not have it we 
	//create the method inside Utils class and use it
	
	
	public static void printElFunctional(List<Integer> l) {
		l.
		stream().
		forEach(Utils::printInTheSameLineWithASpace);
	}
	
	//2)Create a method to print the even list elements on the console 
	//in the same line with a space between two consecutive elements.(Method Reference) (edited) 

	public static void printEvenFunctional(List<Integer> l) {
		l.stream().
		filter(Utils::isEven).
		forEach(Utils::printInTheSameLineWithASpace);
	}
	
	//3)Create a method to print the square of odd list elements on the console 
	//in the same line with a space between two consecutive elements.
	public static void printSquareOfOdds(List<Integer> l) {
		l.stream().
		filter(Utils::isOdd).
		map(Utils::getSquare).
		forEach(Utils::printInTheSameLineWithASpace);
	}
	
	//4)Create a method to print the cube of distinct odd list elements on the console 
	//in the same line with a space between two consecutive elements.
	public static void printCubeofDistinctOdds(List<Integer> l) {
		l.
		stream().
		distinct().
		filter(Utils::isOdd).
		map(Utils::getCube).
		forEach(Utils::printInTheSameLineWithASpace);
	}
	
	//5)Create a method to calculate the sum of the squares of distinct even elements
	public static void printSumofSquaresDistinctEvens(List<Integer> l) {
		int sum=l.
				stream().
				distinct().
				filter(Utils::isEven).
				map(Utils::getSquare).
				reduce(0,Math::addExact);
		System.out.println(sum);
	}		
	
	//6)Create a method to calculate the product of the cubes of distinct even elements
		public static void printCubesofDistinctEvens(List<Integer> l) {
			int product=l.
					     stream().
					     distinct().
					     filter(Utils::isEven).
					     map(Utils::getCube).
					     reduce(1,Math::multiplyExact);
			System.out.println(product);
		}
	//7)Create a method to find the maximum value from the list elements
		public static void printMaxValue(List<Integer> l) {
			int max=l.
					stream().
					reduce(Integer.MIN_VALUE, Math::max);
			System.out.println(max);
		}
	//8)Create a method to find the maximum value from the list elements
		//2.Way
		public static void printMinValue2(List<Integer> l) {
			int min=l.
					stream().
					distinct().
					reduce(Integer.MAX_VALUE, Math::min);
			System.out.println(min);
		}
	//9)Create a method to find the minumum value which is greater than 7 and even
		public static void printMinValueAfter7(List<Integer> l) {
			int min=l.
					stream().
					filter(t->t>7).
					filter(Utils::isEven).
					reduce(Integer.MAX_VALUE, Math::min);
			System.out.println(min);
		}
	//10)Create a method to find the half of the elements which are distinct and 
	//greater than 5 in reverse order from the list.
					
		public static void getHalfOfDistinctElReversed(List<Integer> l) {
			List<Integer> resultList = l.
									    stream().
									    distinct().
									    filter(t->t>5).
									    map(Utils::getHalf).
									    sorted(Comparator.reverseOrder()).
									    collect(Collectors.toList()); 
			System.out.println(resultList);
		}
		
}
