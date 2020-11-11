package Inhertancepackage;


// Overriding Method
// Rewrite the method in child classes 
// // rules. 
//1. methods defination (datatype) should be same 
//2. body ( statement) should be changed 
class Bank
{
	
	int a = 3242; 
	
	
	public void rateOfInterest()
	{
		 System.out.println("interst rate");
	}
	
}


 class SBI extends Bank
 {
	
	 int a = 23423; 
	 
	
	
			
	
		
	}
	 
 
//
// class ICICI extends Bank
// {
//
//		double rateOfInterest()
//		{
//			return 8.5; 
//		}
//		
//	}
// 
//
//class AXIS extends Bank
//{
//	
//	double rateOfInterest()
//	{
//		return 9.7; 
//	}
//	

//}



public class OverridingMethod {

	public static void main(String[] args) {
		

	 
	 
		SBI sbi= new SBI(); 
	System.out.println(sbi.a); 
	
		sbi.rateOfInterest(); 
		
		
	
		
//		ICICI icici = new ICICI(); 
//		icici.rateOfInterest(); 
//		System.out.println(icici.rateOfInterest());
//		
//		
//		
//		AXIS axis= new AXIS(); 
//		axis.rateOfInterest(); 
//		System.out.println(axis.rateOfInterest());
//		
	}

}
