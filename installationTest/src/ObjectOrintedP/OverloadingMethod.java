package ObjectOrintedP;

public class OverloadingMethod {

	// Overloading : creating methods and constructor with same name and with different Parameters
	// advantage will be : save memory and save time


	
	 void add (int a, int b) //1 
	{
		
		System.out.println("number 1=: "+a+b);
	}
	void add (double a, int b)// 2
	{
		
		System.out.println("number 2=: "+a+b);
	}
	void add (int a, int b, int c)//3
	{
		
		System.out.println("number 3=: "+a+b+c);
	}
	
	public int add (int a, double b)//4
	{
		
		return (int) (a+b); 
	}
	
	
	 int Jamshidy; 
	
	
	public static void main(String[] args) {

		
		OverloadingMethod cal =new OverloadingMethod(); 
		
		cal.add(10.2, 10);
		cal.add(10, 20.3);
		cal.add(12, 11);
		cal.add(2, 3, 5);
	}

}
