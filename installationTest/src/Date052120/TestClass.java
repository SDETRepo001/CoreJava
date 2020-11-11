package Date052120;

import java.io.FileNotFoundException;

public class TestClass {

	public static void main(String[] args) {

		try {
		
			FileInputStream x = new FileInputStream("");
		}
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
			 
		 }
		
		
		TestClass obj = new TestClass(); 
		obj = null; 
		
		try {
			
			System.out.println(obj.a);
		}
		catch (NullPointerException e) {
			System.out.println(e);
		}
		
		int num1 =10; 
		int num2 =0; 
		
		if ( num2==0) {
			
			System.out.println("can not divide by zero");
		}else 
		{
			
			System.out.println(num1/num2);
		}
		
		
		
		
		
		
	System.out.println();	
	}



   public static int makeAnError (int x) {
	   
	   return makeAnError(x);
	   
   }
   }