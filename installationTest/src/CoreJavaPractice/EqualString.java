package CoreJavaPractice;

public class EqualString {

	public static void main(String[] args) {

		
		String a = "Afghanistan"; 
		
		String b = "Afghanistan"; 
		
		
		if(a.equals(b)) {
			System.out.println("A and B is equals");
			
		}
		else {
			
			System.out.println("Not equal");
		}
		
		//***********    Second Method
		
		if (a.compareTo(b)==0) {
			System.out.println("A and B is equl using second method");
		}
		
		else {
			System.out.println("Not equal method 2");		}
	}

}
