package CheetSheetJava;

public class Java_practice {
	
	

	public static void main(String[] args) {
		
		int num = 100; 
		
		if (num%2==0) {
			System.out.println("even numbers");
		}
		else {
			System.out.println("odd numbers");
		}
		
		int a=28; 
		int b=46; 
		int c=4545; 
		
		if (a>b && a>c) {
			System.out.println("A is great number"+a);
			
		}
		else if (b>c) {
			System.out.println("B is greate"+b);
			
		}
		else {
			System.out.println("C is great number"+c);
		}


//		String Hamid= "Afghanistan"; 
//		
//
//		StringBuffer sb= new StringBuffer(Hamid);
//		
//	System.out.println(sb.reverse());
//		
//	
//	
		String jamhisd = "Abdul Hamid"; 
	String rev= ""; 
	 
	for (int i =jamhisd.length()-1;i>=0;i--) {
		rev=rev+jamhisd.charAt(i); 

	}
	System.out.println(rev);
	
	int xy= 12345; 
	
	String stre = String.valueOf(xy); 
	
	StringBuffer sb= new StringBuffer(stre); 
	System.out.println(sb.reverse()); 
	
	System.out.println("******************************************");
	System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
	String abc = "$%$34234abDULHamidjamshid"; 
	
	String ab=abc.replaceAll ("[^A-z]", ""); 
	System.out.println(ab);
	
	}

	
	}

