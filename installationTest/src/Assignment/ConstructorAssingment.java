package Assignment;

public class ConstructorAssingment {

	int x;
	int y;
	int z; 
	
	ConstructorAssingment()
	
	{
		x=10;
		y=20;
		z=40;
		
	}
	
	void sum()
	{
		System.out.println(x+y+z);
		
	}
	
	
	public static void main(String[] args) {

		ConstructorAssingment total = new ConstructorAssingment (); 
		
		total.sum();
		
		
		
		
	}

}
