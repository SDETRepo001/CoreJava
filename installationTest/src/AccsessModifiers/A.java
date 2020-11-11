package AccsessModifiers;

//Access Modifiers

		// we have 4 access modifiers 

		// 1. private 
		//2.  default 
		// 3. protected 
		// 4. public


	//1. the private Access Modifiers is accessible only withn the class 

	//2. default : if you don't use any modifier, its treated as default by default. 
	// the default modifier is accessable only within the package 

	// 3. Protected : the protected access modifiers is accessible within package and outside the package 
	// but trough inheritance only. 

	//4. public access everywhere 

public class A 
{
	
	//************************************************
//	private int date = 10;  // private 
//	private void m1() {}    // private 
	
	//**********************************************
	
	// int date = 10;  // default  
	 //void m1() {     // default
		// System.out.println(date);
//	 }      
	
	//****************************************************
	
	 //protected int date = 10;  // protected   
	 //protected void m1() {     // protected
		// System.out.println(date);
		 
		 
		 // i have created another class in another package at (dataType) and class name ( accessModifiersSample)
		 //to hinherte the class 
	public int date = 10;  // public   
		 public void m1() {     // public
			 System.out.println(date);
	
	 }  
	 









	public static void main(String[] args) {

		A aobj = new A(); 
		
		aobj.date=20; // Compile Time Error if we run it in private modifiers
		aobj.m1();   // Compile time Error  ===============================
		
		
		
	}

}
