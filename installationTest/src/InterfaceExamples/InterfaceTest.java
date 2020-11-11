package InterfaceExamples;


interface A
{
	 int a=10; // by default vaaibles in inteface are static and final
	
	 public void m1(); // abstract method, by default is it public
}




public class InterfaceTest implements A 

   {

	public void m1() 
	{
		System.out.println(a);
	}
	
	
	
	
	public static void main(String[] args) {
		
		InterfaceTest t = new InterfaceTest(); 
	//	            A t = new InterfaceTest(); // we can also access the method throgh interface defination 

		t.m1(); 
		
		
	}
}
