package Inhertancepackage;

class Parent 
{
	int a; 
	void Display()
	{
		System.out.println(a);
	}
}

class child1 extends Parent
{
	int x; 
	void show()
	{
		System.out.println(x);
	}
	
}

class child2 extends Parent

{
	int y; 
	void print ()
	{
		System.out.println(y);
	}
}


public class HierarchyInhertance {
	
	

	public static void main(String[] args) {
		
		child1 c1= new child1(); 
		
		c1.a=10; 
		c1.x=20; 
		c1.Display();
		c1.show();
		
		child2 c2 = new child2(); 
		
		c2.a=30; 
		c2.y=40; 
		c2.Display();
		c2.print();
		
		

	}

}
