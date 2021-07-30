package adeneme;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PairedShoes {
	
	public static void main(String[] args) {
		
	

	    /*
	     * Complete the 'sockMerchant' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER n
	     *  2. INTEGER_ARRAY ar
	     */
	     int n=7;
	     List <Integer> ar = new ArrayList<>();
	     Collections.addAll(ar, 1,2,1,2,1,3,2);
	 
	     System.out.println(sockMerchant(n,ar));

	}
	    public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
	    int counter=1;
	    int pair = 0;
	    List <Integer> list = new ArrayList<>();
	    for (int i=0; i<n; i++) {
	        for (int j=i+1; j<n; j++) {
	            if (ar.get(i).equals(ar.get(j))) {
	                counter++;
	            } 
	        }
	        if (!list.contains(ar.get(i))) {
	            list.add(ar.get(i));
	            pair= pair + counter/2;
	        }
	        counter=1;
	    }
	    return pair;
	    }

	}


