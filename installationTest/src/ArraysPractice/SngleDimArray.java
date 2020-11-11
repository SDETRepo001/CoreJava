package ArraysPractice;

public class SngleDimArray {

	public static void main(String[] args) {

		int a[] =new int [5];// Declared array with size 5 , startign index is 0, last index is 4
		
		// storing/ Inserting values int array
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		
		int b[]= {100,200,300,400,500};// declare an Array without specifying size
	
		System.out.println("Length of b Array is :  "+ b.length); // Prints length/ size of an array
		
		
		
		// read a value from an array, we can use normal for loop and advanced for loop to read it 
		
		System.out.println(a[2]);// read the array in a specific index
		
		for (int i=0;i<=b.length-1;i++)
		{
			System.out.println("Array B result :>  "+b[i]);
		}

		for (int i:a)
		{
			
		 System.out.println("Array a result useing enhence array:>  "+i);
					
				
			}
			
		int c []=new int [3]; 
		
		c[0]=1000;
		c[1]=2000;
		c[2]=3000;
		
		
	    for (int j=0;j<3;j++)
		{
			System.out.println("Using for loop:   "+c[j]);
		}
		
	
	for (int i:c)
	{
		System.out.println("Using enhence loop :  "+i);
	}
			
	String x []=new String [5]; 
	
	x[0]="Abdul Hamidi"; 
	x[1]="Jamshid"; 
	x[2]="Homayoon"; 
	x[3]="Sultan"; 
	x[4]="Kabir"; 
	
	for (String k:x)
	{
		System.out.println(k);
	}

	for (int h=0; h<5;h++)
	{
		System.out.println(x[h]);
	}
	
	
	
	
	
			
			
		}
		
		
		
		
	}


