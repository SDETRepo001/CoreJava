package Inhertancepackage;


// Multilevel Inhertance 

class Abdul
{
	int a; 
	void display()
	{
		System.out.println(a);
	}
}

class Jamshid extends Abdul // B is child class and A is parant class 
{
	int b; 
	void print()
	{
		System.out.println(b);
	}
}

class shiaq extends Jamshid
{
	int c; 
	void show ()
	{
		System.out.println(c);
	}
}


public class MultilevelInheritance {

	


		public static void main(String[] args) {
			
//			A obj = new A(); 
//			 
//			obj.a=10; 
//			obj.display();
//			
			
//			B obj1 = new B(); 
//			
//			obj1.a=20; 
//			obj1.b=30;
//			obj1.display();
//			obj1.print();
			
			shiaq obj2= new shiaq(); 
			
			
			obj2.a=10; 
			obj2.b=20; 
			obj2.c=30; 
			obj2.display();
			obj2.print();
			obj2.show();
			

		}

	}
