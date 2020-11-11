package Datatype;

public class Assignment002 {

	public static void main(String[] args) {

		
		System.out.println("******Write a java programe to find a number is even or odd *********************************************\n");
		int a=4;
		
		
		if (a%2==0)
		{
			System.out.println("even numbers");
		}
		
		else
		{
			System.out.println("Odd Numbers");
		}
	
		System.out.println("*****write a java program to find the greatest number ****************************************************************");
		int b= 1000;
		int c= 200;
		int d=100;
		
		if (b>c&&c>d)
		{
			System.out.println("B is gretest Number:   "+b);
		}
		else if (c>d)
		{ 
			System.out.println("C is grestest number:   "+c);
		}
		else 
		{
			System.out.println("D is grestest number:   "+d +"\n");
		}
		
	System.out.println("*****Write a java Program to display the multiplication table of 5*************************************************");	
	    for (int e=5;e<=50;e+=5)
	    {
	    	System.out.println("5 X 0 = "+ e);
	    }
		
	
		
	    System.out.println("*****Write a program to find the count of numbers*************************************************");
		
		int num=23486234; 
		int count=0;
		
		while (num>0)
		{
			num/=10;
			count++;
		}
		System.out.println(count);
		
		int z =1;
	    for (int e=6;e<=60;e+=6)
	    {
	    	System.out.println(z++ +"5 X "  +" = "+ e);
	    }

	}
	

}
