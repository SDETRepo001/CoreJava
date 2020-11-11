package CoreJavaPractice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayPractice {
	public static void main(String[] args) {
		
		
		
		
	
		
//		Integer [] ID  =new Integer [5];
//		
//		ID [0]=null;
//		ID [1]=5;
//		ID [2]=1;
//		ID [3]=3;
//		ID [4]=2;
//		for (Integer iinteger : ID) {
//			System.out.println(iinteger);
//		}
//		
//		
//		HashSet <Integer> hs = new HashSet <Integer>(); 
//		
//		hs.add(343); 
//		
//		hs.add(null); 
//		
//		for (Integer innteger : hs) {
//			System.out.println(innteger);
//		}
		
		int a = 1; 
		int b = 2; 
		int c = 3; 
		
		
		HashMap <String, Integer> hm = new HashMap<String,Integer> (); 
		
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);
		
		System.out.println(hm.get("a")); 
		System.out.println(hm.getOrDefault("b", c));
		
		

		ArrayList <Integer> al = new ArrayList<Integer>(); 
		
		al.add(345); 
		al.add(343); 
		al.add(676);
		al.add(45); 
		

		Collections.sort(al, Collections.reverseOrder());
		for (Integer integer : al) {
			
		}
		System.out.println(al.get(0));
		
		
		
		  
		
	//Arrays.sort(ID);
//	
//		Set<Integer> LID=new HashSet<Integer>(Arrays.asList(ID));
//		for(int llid :LID) {
//			System.out.println(llid);
//			
//			
//		}
	}
}

