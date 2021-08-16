package adeneme;

import java.util.Arrays;
import java.util.Random;

public class pi {

	public static void main(String[] args) {
		
		double rand [][] = new double [100000][2];
		for (int i=0; i<rand.length; i++) {
		 rand[i][0] = Math.random();
		 rand[i][1] = Math.random();
		}
		
		execute("Java Echo Hello you !");
		
		System.out.println(approx(rand));
		System.out.println();
		
		System.out.println(reshape(2,"1 23 456"));
		 
		
		

	}
	
	private static void execute(String str) {
		String arr[]=str.split(" ");
		int flag = 0;
		System.out.println(Arrays.toString(arr));
		for (int i=0; i<arr.length-1; i++) {
			if (arr[i].equals("Echo")) {
				flag=1;
				continue;
			}
			if (flag==1) {
				System.out.println(arr[i]);
				
			}
		}
		
	}

	private static double approx(double[][] rand) {
		double counter =0;
		for (int i=0; i<rand.length; i++) {
			
				if (Math.pow(rand[i][0],2)+Math.pow(rand[i][1],2)<1) {
					counter++;
				}
				
			}
		return counter*0.00004;
		}
	
	public static String reshape(int n, String str) {
		if (str.length()<n) {
		 return str;
		} else {
		str=str.replaceAll("\\s", "");
		StringBuilder s = new StringBuilder(str);
			s.delete(0, n);	
			String s1=s.toString();
		    str = str.substring(0,n);
		
		
		return str + System.lineSeparator() + reshape(n,s1);
		}
		
	}
		
	}

	

	
	
	


