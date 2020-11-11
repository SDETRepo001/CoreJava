package Inhertancepackage;


// Single Inhertance 

class A
{
	int a; 
	void display()
	{
		System.out.println(a);
	}
}

class B extends A // B is child class and A is parant class 
{
	int b; 
	void print()
	{
		System.out.println(b);
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		
//		A obj = new A(); 
//		 
//		obj.a=10; 
//		obj.display();
//		
		
		B obj1 = new B(); 
		
		obj1.a=20; 
		obj1.b=30;
		obj1.display();
		obj1.print();

	}

}
