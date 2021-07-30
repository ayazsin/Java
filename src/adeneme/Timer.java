package adeneme;

public class Timer {

	public static void main(String[] args) {
		timer(2);
	}
		public static void timer(int time) {
			   for(int i = time - 1; i >= 0; i--) {
			      for(int j = 60; j >= 0; j--) {
			         try{
			            Thread.sleep(1000);
			         }
			         catch(InterruptedException e){//this is checked exception. must be thrown
			         }
			         System.out.println(i + " minutes and " + j + " seconds left");
			      }
			   }
			   System.out.println("Time is up");
			}

	}


