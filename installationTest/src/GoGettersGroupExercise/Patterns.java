package GoGettersGroupExercise;

public class Patterns {

	public static void main(String[] args) {

	
		int row = 10;
		
		
		for( int i =0; i <=row; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");	
			}
			
		 for (int k = i*2; k <= row*2; k++) 
			 
		 {
			 System.out.print("o"); 
		 }
		 System.out.println();
			}
		
			}
	}	

	