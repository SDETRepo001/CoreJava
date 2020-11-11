package InterfaceExamples;

class A1
{
	void m1()
	{
		System.out.println("This is the 1 method from A1 Class");
	}
	
}

interface B1
{
	void m2();
	
}


interface B2
{
	void m3();
}



public class HybridInheritance extends A1 implements B1, B2
{
	
	public void m2()
	{
		System.out.println("This is m2 method ");
	}
	
	public void m3()
	{
		System.out.println("This is m3 method");
	}

	public static void main(String[] args) {

		
		HybridInheritance test1 = new HybridInheritance(); 
		
		test1.m1();
		test1.m2();
		test1.m3();
		
		
		
		
	}

}
