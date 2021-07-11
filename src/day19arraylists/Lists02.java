package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Lists02 {

	public static void main(String[] args) {
		 //How to create a list
		 //1.Way
		 ArrayList<Integer> list1 = new ArrayList<>();
		 //2.Way
		 List<Integer> list2 = new ArrayList<>();
		 
		 
		 //How to add elements into a list
		 list1.add(12);
		 list1.add(11);
		 list1.add(10);
		 //How to put an element into a specific index
		 list1.add(1,13);
		 
		 System.out.println(list1);//[12, 13, 11, 10]
		 
		 //How to sort list elements in ascending order
		 Collections.sort(list1);
		 System.out.println(list1);//[10, 11, 12, 13]
		 
		 //How to get a specifi element from a list
		 System.out.println(list1.get(2));//12
		 //There is no index4, because of that you will get Run Time Erro
		 //System.out.println(list1.get(4));
		 
		 list2.add(9);
		 list2.add(2);
		 list2.add(19);
		 list2.add(4);
		 list2.add(71);
		 list2.add(-3);
		 
		 //Type code to find the min and max value from list
		 Collections.sort(list2);
		 System.out.println(list2.get(0) + " " + list2.get(list2.size()-1));
		 
		 //How to check if a list is empty list or not
		 System.out.println(list2.isEmpty());
		 
		 List<String> list3 = new ArrayList<>();
		 System.out.println(list3.isEmpty());
		 
		 //How to remove an element from a list by using index
		 //Below code will remove the element at index 2, 
		 //and will return the removed element
		 System.out.println(list2.remove(2));//4
		 System.out.println(list2);//[-3, 2, 9, 19, 71]
		 
		 //list2.remove(6);//run time error
		 
		 //How to remove an element from a list by using the element value
		 //Note: For integer lists, you cannot remove an elemet 
		 //by using element value. Because when you put an integer inside 
		 //the remove() method it will accept it as index.
		 
		 list3.add("Ali");
		 list3.add("Veli");
		 list3.add("Mary");
		 list3.add("Sunny");
		 list3.add("Tony");
		 
		 System.out.println(list3);//[Ali, Veli, Mary, Sunny, Tony]
		 System.out.println(list3.remove("Mary"));//True
		 System.out.println(list3);//[Ali, Veli, Sunny, Tony]
		 
		 //Remove Veli and add Velihan in the index of Veli
		 //1.Way: Not recommended
		 int idx = list3.indexOf("Veli");
		 list3.remove("Veli");
		 list3.add(idx,"Velihan");
		 System.out.println(list3);
		 
		 //2.Way: set()
		 //set() method is used to update an element by using index
		 //set() method returns the previous element
 		 //[Ali, Veli, Sunny, Tony]
		 System.out.println(list3.set(list3.indexOf("Sunny"), "Jhonny"));
		 System.out.println(list3);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
