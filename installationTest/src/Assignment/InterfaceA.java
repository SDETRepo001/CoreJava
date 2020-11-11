package Assignment;



//Question
// write a programe to demonstrate interface 
//interface A: int a; int b; sum();
//calss B: implements method from A adn calcuate sum of a and b 



interface AB
{
	int a =100; 
	
	int b = 200; 
	
	 void sum();
	
	
	
}









public class InterfaceA  implements AB 
{
	public void sum(){
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		
		InterfaceA method = new InterfaceA();
		
		method.sum();
		
		
	}
}
