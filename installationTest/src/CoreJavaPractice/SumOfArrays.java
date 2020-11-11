package CoreJavaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SumOfArrays {
	public static void main(String[] args) {
		
		String [] a = {"1","2","4"}; 

		
		List <String> alist = new ArrayList <String>(); 
		 alist = Arrays.asList(a); 
		 
		
		
		for (int i : alist) {
			Arrays.sort(a);
			
			System.out.println(i);
		}

		

		Arrays.sort(a, Collections.reverseOrder());
		
		int k=a[0]+a[1];
		
		
		for (String i : a) {
			
			System.out.print(i);
		}
	}
	
	
	

}
