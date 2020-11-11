package CoreJavaPractice;

public class Swap2Strings {

	public static void main(String[] args) {

		String a = "Jamshid"; 
		String b = "Baryalay"; 
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
		
		
	}

}
