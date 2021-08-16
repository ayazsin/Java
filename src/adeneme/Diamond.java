package adeneme;

public class Diamond {
	
	public static void main(String[] args) {
		char [] arr = {'E','D','C','B','A','B','C','D','E'};
		int idx=4;
		for (int i=1; i<6; i++) {
			for(int j=i; j<5; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i+i-1; j++) {
				System.out.print(arr[idx+j]);	
			}
			idx--;
			System.out.println();
		}
		idx=1;
		int k=1;
		for (int i=4; i>0; i--) {
			for (int j=0; j<k; j++) {
				System.out.print(" ");
			}
			k++;
			int m =0;
			for (int j=2*i-2; j>=0; j--) {
				System.out.print(arr[idx+m]);
				m++;
			}
			idx++;
			System.out.println();
		}
		
	}	

}
