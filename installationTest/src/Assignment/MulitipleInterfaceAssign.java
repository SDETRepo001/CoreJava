package Assignment;

class a
{
	void min()
	{
		System.out.println("Abdul Hamid Hamidi assignmend");
	}
	
	
}


interface ABC
{
	
	int a = 10; 
	int b = 2; 
	void add(); 
	
}

interface AA 
{
	
	int c = 4; 
	int d = 6; 
	void mul(); 
	
	
}











public class MulitipleInterfaceAssign extends a implements ABC, AA{
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	
	public void mul()
	{
		System.out.println(c*d);
	}
	
	
	
public static void main(String[] args) {
	
 
	MulitipleInterfaceAssign count = new MulitipleInterfaceAssign(); 
	
	count.min();
	count.add();
	count.mul();
	
	
	
	
}


}

