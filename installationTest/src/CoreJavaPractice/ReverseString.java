package CoreJavaPractice;

public class ReverseString {

	public static void main(String[] args) {

		
		String a = "Jamshid"; 
		
		String Rev= ""; 
		
		for (int i = a.length()-1; i >= 0; i--) {
			
			
			Rev=Rev+a.charAt(i); 
			
			
		}
		System.out.println(Rev);
		
	}

}
