package Inhertancepackage;

 class Bike // the 3rd part  if we put keyword final inform of class name it wont be extends to anthor class 
{
	final void run()// the second part Final method, so we connot override this method in child class
	{
		
		System.out.println("Running......");
	}
	
	
}




class Honda extends Bike

{
	void run()
	{
		System.out.println("Started........");
	}
}






public class FinalInMethod002 {

	public static void main(String[] args) {

		
		
		
	}

}
