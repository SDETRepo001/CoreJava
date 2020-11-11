package CoreJavaPractice;

public class ReverseAString {
public static void main(String[] args) {
	
	
	String gevin = "Abdul Hamid Baryalay and jamshid"; 
	String rev="";
	StringBuffer  gha=new StringBuffer(gevin);
	System.out.println(gha.reverse());
	
	for (int i = gevin.length()-1;i>=0; i--) {
		rev=rev+gevin.charAt(i);
		
	}
	
	
	System.out.println(rev);

	
	
	
	
}
	
	
	
	
	
}
