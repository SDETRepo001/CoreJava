package CoreJavaPractice;

public class AlphCharPrinsent {
	
	public static void main(String[] args) {
		
		
		String gevin = "abdulhamid23432$#^%^#"; 
		String rep = ""; 
		
		gevin.length();
		rep=gevin.replaceAll("[^A-Za-z]", rep); 
		
		System.out.println(rep.length());
		
		
		
		
		
	
	}

}
