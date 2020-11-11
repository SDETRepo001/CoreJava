package ExceptionsPractice;



// Unchecked Exception 





public class ExceptionsExample {

	
	public static void main(String[] args)   {

		
		System.out.println("programe is strated");
		System.out.println("Progeme is in progress");
		

//	Thread.sleep(5000);//checked 
//		
//	
//	
//
		try {
		System.out.println(100/0);// unchecked 
		}
		catch(Exception d) {
			System.out.println(d);
		}
		
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e1) {
//		}
//		
		
		
		System.out.println("****************************");
//		int a = 100; 
//		int b = 0;
//		
//		try {
//		System.out.println(a/b);  //ArithmeticException logically "Unchecked Exception"
//		}
//		catch (Exception e ) {
//			System.out.println("ArithmeticException Exception accured");
//		}
////		
		
		System.out.println("Programe is ended");
//		
		//***************************************************************
		String S = null; 
		
		try {
		System.out.println(S.length());//NullPointerException 
		}
		catch (Exception q) {
			System.out.println("what is the exceptin type:    "+q);
		}
		{
		System.out.println("NullPointerException accured");
		}
		
	
	//*****************************************************************	

//        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, 
//                          { { 5, 6 }, { 7, 8 } } }; 
//  
//        for (int i = 0; i < 2; i=i+1) { 
//  
//            for (int j = 0; j < 2; j++) { 
//  
//                for (int k = 0; k < 2; k++) { 
//  
//                    System.out.print(arr[i][j][k] + " "); 
//                } 
//  
//                System.out.println(); 
//            } 
//            System.out.println(); 
//        } 
//        System.out.println(arr[0][0][0]);
//        System.out.println(arr[0][0][1]);
//        System.out.println(arr[0][1][0]);
//        System.out.println(arr[1][0][0]);
//        System.out.println(arr[1][0][1]);


        
      
        
        for (int i=10; i<=20&&i>0; i=i/2 ) {
        
        System.out.println(i);
        
        
        }
            
        
    
 

 
		
	
		
		
	//	String a="123"; //NumberFormatException
		
	
//	 int x= 123123; 
	 String str = "jamshid"; 
	 try {
	  int b = Integer.parseInt(str); 
	  System.out.println(b);

	 } catch (Exception e) {
		 System.out.println(e);

	 }
	 
	 

//		try {
//		int x =Integer.parseInt(a);
//		}
//		catch (Exception w)
//		{System.out.println(w);
//			System.out.println("NumberFormatException happend");
//		}
//		finally {
//			System.out.println("finally 1");
//			
//		}
		
		
		

		
		//**************************************************************
//		
//		int abc []= new int [5]; 
//		abc[3]=979;
//		System.out.println(abc[3]);
//		
//		Object xy[][]= new Object [5][4]; 
//		
//
//		xy[0][6]="Ahamd"; //ArrayIndexOutOfBoundsException
//		System.out.println(xy[0][6]);
//		
//		
	
		
		//*********************************************************
//		try {
//		int a = 100; 
//		
//		System.out.println(a/0);  //ArithmeticException logically "Unchecked Exception" and finally 
//		}
//		catch (ArithmeticException e)
//		{
//			System.out.println("entered in to catch block");
//		}		
//		finally 
//		{
		System.out.println("Entered into finally");
		System.out.println("End of program ");

		}
		
}



