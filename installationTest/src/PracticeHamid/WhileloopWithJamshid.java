package PracticeHamid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class WhileloopWithJamshid {

	public static void main(String[] args) {
		

	
	String [] names = {"jamshid","Baryalay","Agha abbas","Hamid"}; 

	String [] names1 = {"jamshid","Baryalay","homayoon","Shaiq"}; 


	
Set <String>as = new  HashSet <String>(); 
for (String a : names) {
	as.add(a);
}
for (String b : names1)
{
as.add(b);	
}

System.out.println(as);

 
   
	
	
	}
}
