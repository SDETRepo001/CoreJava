package CollectionExample;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {

	public static void main(String[] args) {

		
		// we can define Hashmap in deffrent ways:
//*********************************************************************************		
		//Declaration
		
	    //	HashMap = hm = new HashMap(); 
		HashMap<Integer, String>  hm = new HashMap<Integer, String>(); 

		
//********************************************************************************		
		//Adding Pairs (Values) into Hashmap
		
		hm.put(101, "Abdul");
		hm.put(102, "jamshid");
		hm.put(103, "Qasim");
		hm.put(104, "Sajad");
		hm.put(105, "Abdul jamil");
		
		System.out.println(hm);
//**********************************************************************************
	//	Remove a pair from hashmap
		
		hm.remove(102); 
		System.out.println("After remove a pair ::"  + hm);
		
//**********************************************************************************
		//Reading pair using for loop
		
		
		
		for(Map.Entry m: hm.entrySet())
		{
			
			System.out.println(m.getKey()+ "  "+ m.getValue());
			

		}
		
//****************************************************************
		System.out.println(hm.get(105));
		
		
		
	}

}
