package ObjectOrintedP;

public class StaticExample {

	// summery of Static in 3 sentences  
	// 1. static methods can access only static stuff ( directly- witout creating an object 
	//2. static methods can also access no static stuff though object 
	//3. non static methods can access both static and non static stuff directly 
	
	static int a=10;// static varible  
	
	int b=20; // non static
	
	
	static void m1()
	{
		System.out.println("This is static method");
	}
	
	void m2()
	{
		System.out.println("This is non static method");
	}
	
	// 3 senteces applied below 
	
	void m3()
	{
		System.out.println("This is m3 method non static method ");
		System.out.println(b);// non static
		System.out.println(a);// static
		m2();
		m1(); 
	}
	
	
	public static void main(String[] args) {
	

		System.out.println(a);
		//System.out.println(b);   this is an incorrect 
		StaticExample var = new	StaticExample(); 
		
		var.m2(); // non static method  access trough obj
		System.out.println(var.b); // non static variable access trough obj
		System.out.println(a);// static varaible direct access

		m1(); // static method direct access 
		var.m3(); 
		
		
	}

}
