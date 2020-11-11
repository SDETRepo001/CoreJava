package Constructor;

public class ConstructorDemo {
 
	// two type of Constructor 
			// 1. default constructor 
			// 2. parameterized constructor 
			
			//** Default Constructor
		
	int a; 
	int b; 
	
//	
//	ConstructorDemo()  // default constructor 
//	{
//		x=10; 
//		y=20;
//	}
//	
	void display()
	{
		System.out.println(a+b);
	}
	
	
static {System.out.println("************* Parameterized constructor***************************");}
	
	
	
	
	
	ConstructorDemo(int a, int b)  // parameterized constructor 
	{
		this.a=a; 
		this.b=b;
	}
	
	
	
	
	
	
	public static void main(String[] args) {

   
//		ConstructorDemo cm= new ConstructorDemo(); //Invokes default constructor
//		cm.display();
//		
//		
//		
		
		
		
		
		
		
		
		
		ConstructorDemo ab= new ConstructorDemo(100, 200);  // invokes parameterized constructor 
			ab.display();
		
		
		
		
		
		
		
	}

}
