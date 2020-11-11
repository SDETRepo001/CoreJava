package Assignment;

public class Assignment003 {

	public static void main(String[] args) {

		
		//write a program to calculte sum of an array 
		
		
		int a []= new int [6]; 
		int sum=0; 
		
		
		a[0]= 10; 
		a[1]=15; 
		a[2]= 10; 
		a[3]=15; 
		a[4]= 10; 
		a[5]=15; 
		

		for (int i : a) {
			sum =i+sum;
			
		}
	System.out.println(sum);
	
	System.out.println(a[0]+a[1]);
	
	// Write a Java program to search specific number in array 
	
	System.out.println(a[4]);
	
	// Define an Array with some String Vaules and Write a java program to seach 
	// specfic string in an array 
	
	String []data= new String[3]; 
	
	data[0]= "Jamshid"; 
	data[1]= "Abdul"; 
	data[2]= "Hamid"; 
	
	
	System.out.println(data[2]);
	
	
	
	// write a program in java  to print even and odd number in array
	System.out.println("******************************************************************************");
	int data1 []= new int [4]; 
	
	data1[0]=10; 
	data1[1]=9; 
	data1[2]=12; 
	data1[3]=103; 
	
	System.out.println("even numbers");
	
	for (int k=0; k<data1.length; k++) {
		
	
		if (data1[k]%4==0) {
			System.out.println(data1[k]);
			
		}{	
		System.out.println("odd numbers");
		}
		for (int i=0; i<data1.length; i++) {
		
	 
		if ( a[i]%2!=0) {
		System.out.println(data1[i]);
			
		}
	
	
		}
	}
	}
}
	

		
	



