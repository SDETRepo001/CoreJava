package ObjectOrintedP;

public class Thiskeyword {

	int a,b; // Class Varaible or Instance varaibles
	
	void getvaules(int a, int b)  // method varaibles / external variable
	{
		this.a=a;// we are using (this) keyword when we need to use the same variable(a and b) for class and method 
		this.b=b;// (this) keyword is used to make diffrent between class variable and method variable 
	}
	
	void printValues()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {

		Thiskeyword th= new Thiskeyword(); 
		th.getvaules(10, 20);
		th.printValues();
		
		
		
	}

}
