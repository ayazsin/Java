package adeneme;

public class tree {

	public static void main(String[] args) {
		System.out.println(sum(471,480));

	}
	
	static int sum(int i, int j) {
		int sum1=0;
		int sum2=0;
		int num1 = i;
		int num2 = j;
		
        
		while(i!=j) {
				
			num1 = i;
			while(num1!=0) {
				
				sum1 = sum1 + num1%10;
				num1= num1/10;
			}
			i=sum1+i;
			sum1=0;
			num2=j;
			while(num2!=0) {
				sum2 = sum2 + num2%10;
				num2= num2/10;
			}
			j=sum2+j;
			sum2=0;
			
			
		}
		
		return i;
	}

}
