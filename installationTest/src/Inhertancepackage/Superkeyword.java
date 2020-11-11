package Inhertancepackage;

public class Superkeyword {
	
	// Super can be used to refer variable form immediate parent class instance 
	//	// Super can be used to refer variable form immediate parent class method 
	//	// Super can be used to refer variable form immediate parent class Constructor 

	String Color = "White"; 
	
	void eating ()
	{
		System.out.println("Eating.......");
	}



Superkeyword ()
{
System.out.println("Animal is created");	
}
}









class dog extends Superkeyword
{
	
	String Color = "Black"; 
	
	dog ()
	{
		super();// the third pard applis here 
		//System.out.println("dog is created");
		
	}
	
	void eating ()
	{
		//System.out.println("Eating bread.......");
		super.eating();// the 2 parts apply here
	}
	void display()
	{
		//System.out.println(Color);
		System.out.println(super.Color); // the 1st part apply here
	}

}

