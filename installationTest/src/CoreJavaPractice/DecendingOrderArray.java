package CoreJavaPractice;

import java.util.Arrays;
import java.util.Collections;

public class DecendingOrderArray {

	public static void main(String[] args) {

		
		
		Integer [] a = {1,5,7,2,10}; 
		int sum = 0;
		int b= a.length;
		System.out.println(b);
		Arrays.sort(a);
		
		sum=sum+a[a.length-1]+a[a.length-2]; 
		
		
		System.out.println(sum);
		
		
	}

}
