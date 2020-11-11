package JavaInterviewQuestions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaInterview {
	
	public static void main(String[] args) {
		
		
		int a = 10; 
		int b= 5; 
		
		a=a+b; 
		b=a-b; 
		a=a-b; 
		
		System.out.println(a+""+b);
		
		String x="hello"; 
		String y="Jamshid";
		
		x=x+y; 
		y=x.substring(0, x.length()-y.length()); 
		x=x.substring(y.length()); 
		System.out.println(x);
	  System.out.println(y);
	  
	  String Given="1234@$@$@assdfdSDFS";
	  
	  String Replace=Given.replaceAll("[A-z]", ""); 
	  
	  int alpha =Given.length()-Replace.length(); 
	  System.out.println(alpha);
	  
	  int num=23; 
	  
	  if (num%2!=0) {
		  System.out.println("odd numbers");
	  }else {
		  System.out.println("even");
	  }
	  
	  String c="You Made it to Tek School Interview Session";

	  System.out.println(c.charAt(4));
	  String []word= c.split(" "); 
	
	  System.out.println(word.length);
	  for (String j :word) {
		  System.out.println(j);
		  
		  String ReverseWord ="Jamshid Test"; 
		  
		  StringBuffer sb = new StringBuffer(ReverseWord); 
		 System.out.println(sb.reverse()); 
		  
		 String reverse=""; 
		 for (int i=ReverseWord.length()-1;i>=0;i--) {
			 
			 reverse=reverse+ReverseWord.charAt(i); 
			 
		 }
		  
		 System.out.println(reverse);
		  
		 String jam ="Zahid"; 
		 
		String r=""; 

		for (int k=jam.length()-1;k>=0;k--) {
			r=r+jam.charAt(k); 
		}
		  System.out.println(r);
		  
		  
		  int l = 12345; 
		  String z = String.valueOf(l); 
		  StringBuffer sj = new StringBuffer(z);
		  System.out.println(sj.reverse()); 
		  
		  
		  
		  String Jamshid = "Qmarz"; 
		  
		  String reve=""; 
		  for(int h= Jamshid.length()-1;h>=0;h--){
			  reve=reve+Jamshid.charAt(h); 
			  
		  }
		  System.out.println(reve);
		  
		  String B ="ABCDEF"; 
		  String Re=""; 
		  for (int e =B.length()-1;e>=0;e--) {
			  Re=Re+B.charAt(e); 
		  }
			  System.out.println(Re);
			  
			  
			  int []ab = {234,2432,1,3,2}; 
		
			  int sum=0; 
			  
			  for (int aj :ab) {
				  sum=sum+aj; 
			  }
		
			  System.out.println(sum);
			  
			  
	  }
	  
	  
}}
