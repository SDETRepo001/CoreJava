package InterfaceExamples;

interface ABC
{
	int x=100; 
	void m1(); 
	
	
}

interface XYZ

{
	int y=200; 
	void m2();
}






public class MultipleInhetance implements ABC, XYZ

{

	public void m1()
	{
		
	}
	
	public void m2 ()
	{
		
	}
	
	
	public static void main(String[] args) {

		
		MultipleInhetance test = new MultipleInhetance(); 
		
		test.m1();
		test.m2();
		
		
		
	}

}
