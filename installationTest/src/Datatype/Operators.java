package Datatype;

public class Operators {

	public static void main(String[] args) {
		
// Operators are  symbols which perform settin opration between tow operands; 

		// Arithmetic Operators ==>  + - * / %
		// relational Operators ==>  (comparison operators) ==> == <= => <> !=
		// Logical Operators ==>     && || !
		// Increment / Decrement operators ==> ++  --
		// Assignment operators ==>  =
		
		
		// **Arithmetic Operators ==>  + - * / %

		int a= 10;
		int b=20; 
		System.out.println("Sum of a and b:"+  (a+b));
		System.out.println("Diff of a and b:"+  (a-b));
		System.out.println("Mul of a and b:"+  (a*b));
		System.out.println("Div of a and b:"+  (a/b));
		System.out.println("Mod of a and b:"+  (a%b));
		
		// relational Operators ==>  (comparison operators) ==> == <= => <> !=

		// Always returns boolean value
		
		System.out.println(a==b);// it should return false 
		System.out.println(a>b);// false 
		System.out.println(a<b);// true
		System.out.println(a>=b);// false
		System.out.println(a<=b);//true
		System.out.println(a!=b);//true
		
		
		// **Logical Operators ==>     && || !
		// logical operators works between tow boolean
		System.out.println("Logical Operators");
		boolean x = true;
		boolean y= false; 
		
		System.out.println(x&&y);// false
		System.out.println(x||y);//true	
		System.out.println(!x);//false
		System.out.println(!y);//true
		System.out.println(x^y);
		
		// Increment / Decrement operators ==> ++  --

		int e=10;
		int f=20;
		e++;//e=e+1;		e+=1;

		f--;//f=f-1;
		
		
		System.out.println(e);
		System.out.println(f);
		
		}

}
