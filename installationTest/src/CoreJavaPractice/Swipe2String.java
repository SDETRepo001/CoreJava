package CoreJavaPractice;

public class Swipe2String {

	public static void main(String[] args) {

		
		String a = "Jamshid"; 
		String b = "Abdul"; 
		
		
		a=a+b; 
		
		b=a.substring(0, a.length()-b.length()); 
		a=a.substring(b.length()); 
      
		System.out.println(a );
		System.out.println(b);
		
	}

}
