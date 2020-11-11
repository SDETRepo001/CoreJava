package GoGettersGroupExercise;

public class Operators001 {

	public static void main(String[] args) {

		//Arithmetic Operators ==> +-*/%
		int a = 10; 
		int b = 20; 
		
		System.out.println("Sum of a and b:  "+(a+b));
		System.out.println("mul of a and b:  "+a*b);
		System.out.println("div of a and b:  "+(double)a/b);
		System.out.println("mod of a and b:  "+((double)a%b)); // remainder 
		System.out.println("deff of a and b:  "+(+a-b));
		
		
		//relational operators ==> (Comparison Operators) == => <= <> != // returns boolean
		
		System.out.println(a==b); // false
		System.out.println(a>b); // false
		System.out.println(a<b); // true
		System.out.println(a>=b); //false
		System.out.println(a<=b);//true
		System.out.println(a!=b);//true
		
		System.out.println("********************************");
		//Logical Operators ==>    && || !
		boolean x = true; 
		
		boolean y = true; 
		
		
	    System.out.println(x&&y);//false 
	    
	    System.out.println(x||y);
	    
	    System.out.println(!x);
	    
	    System.out.println(!y);
	    
	    System.out.println(x^y);
	    
		
		

		//Increament / decrecment Operators ==>  ++ --
	    System.out.println("real number"+a);
	  //   a=a*1;  //a+=1;  //a=a+1 //a++;
	    ++a;
	  a=  a+1;
	    // pre increament 
	     System.out.println("pre inc number"+a);
	  //   System.out.println("seconed pre inc number"+a);
	     a++ ;  // post incre
	   a=  a+1;
	    System.out.println("post number"+a);
	    
	    a--;
	    a=a-1; 
	    
	   //  System.out.println("post number"+a);

		//Assignment operators   ==> =
	    
		

		
		
		
		
		
		
		
	}

}
