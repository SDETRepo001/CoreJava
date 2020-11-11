package ExceptionsPractice;


public class checkedException {

	
	
	public static void main(String[] args) throws InterruptedException 
	{

		
		
		
		System.out.println("Program is strated");
		System.out.println("Program is in prograss");
		
		
		
		//**************************************
//		first way 
		
		int a = 10; 
		int b =0; 
	
	try {
		System.out.println(a/b);
	}
	catch (Exception c) {
		System.out.println(c);

		System.out.println(" you cant divide any number to 0 ");
	}
	finally {
		System.out.println(" 1  an exception accured here ");
	}

	
	
	
//	try {
//			Thread.sleep(5000);}
//	catch (InterruptedException e) {
//		System.out.println(e);
//		System.out.println("The exception runed here");
//	}
//	
//	finally {
//		
//		System.out.println("2     Thred methoed captured by try and catch");
//	}
//			
	
	
	
			
			
			
		
		//*****************************************
//		seconed way
		
		Thread.sleep(10000); // throws to main method 

		//*********************************************************
		
		
		
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		

	
		
	}

	
}
