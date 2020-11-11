package ObjectOrintedP;

public class OverloadingConstructor {

	OverloadingConstructor (int a, int b)

	{
		System.out.println(a+b);
	}
	
	
	OverloadingConstructor (double a, int b)

	{
		System.out.println(a+b);
	}
	
	OverloadingConstructor (int a, int b, int c)

	{
		System.out.println(a+b+c);
	}
	
	OverloadingConstructor (double a, double b)

	{
		System.out.println(a+b);
	}
	
	
	
	
	
	public static void main(String[] args) {

		OverloadingConstructor co= new OverloadingConstructor(10,20); 
		//OverloadingConstructor co1= new OverloadingConstructor(10.2,10); 
		//OverloadingConstructor co2= new OverloadingConstructor(10,10,10); 		
		//OverloadingConstructor co3= new OverloadingConstructor(2.2,2.3); 
		
		
		
	}

}
