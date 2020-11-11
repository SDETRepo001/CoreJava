package ObjectOrintedP;

public class Employee {
	
	// Class --> collection variable and methods 
	//below is class variables  
	int eid;
	String ename; 
	double sal;
	int deptno;
	String job;
	// Method --> block of code which contains a logic 
	// below is class method 
	void display() 
	{
		System.out.println(eid);
		System.out.println(ename);	
		System.out.println(sal);	
		System.out.println(deptno);	
		System.out.println(job);	

	}
	// Object --> object is an instance of a class 
	
//	// Below is actual main method can be present in a same class
//		public static void main (String args[])
//		{
////	
////			
////	// Object		
//			Employee emp1 = new Employee (); // Creating Object
////	
//	emp1.eid=101; 
//	emp1.ename="Jamshid";
//	emp1.sal=25000.00;
//	emp1.deptno=10; 
//	emp1.job="Manager";
//	emp1.display();
//
//	System.out.println("*******************");
//	Employee emp2 = new Employee ();
//	
//	emp2.eid=102; 
//	emp2.ename="Abdul Hamid";
//	emp2.sal=2000.00;
//	emp2.deptno=10; 
//	emp2.job="Assistant";
//	emp2.display();
//	
//	
////	
////	
////	
////	
////
//}
}