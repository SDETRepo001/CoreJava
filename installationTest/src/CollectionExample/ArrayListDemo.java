package CollectionExample;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
//*********************************************************************************
		//How to declare array list
		//	ArrayList <Integer>list = new ArrayList<Integer>();// Integer
		
		//ArrayList list = new ArrayList(); 
		ArrayList <String> Jamsh = new ArrayList<String>(); // String
		
		
		
//*********************************************************************************
		// adding values to arraylist 
		
		Jamsh.add("ahmad");
		Jamsh.add("Jamshid");
		Jamsh.add("Kabir");
//		
//		list.add("Abdul Karim ");
//		list.add("Basir");
//		list.add("Daud");
//		list.add("Emal");
//		list.add(234);
//		list.add('a');
		
//*********************************************************************************		
		
		// size of arraylist
		
		Jamsh.removeIf(d-> (d=="Kabir"));
		
		System.out.println(Jamsh.size());
	//ystem.out.println(list.size());// 4
		
//*********************************************************************************
		//Printing the value of arraylist 
		System.out.println(Jamsh);
	//ystem.out.println(list);
		
	
//*********************************************************************************
	//remove an element
	//	Jamsh.remove(1);
	System.out.println("before removing ahamd");
	//	Jamsh.remove("ahmad");

	/*	if (Jamsh.get(0)=="Jamshid")
		{
			System.out.println(Jamsh.remove("Jamshid"));
		}
		else 
		{
			System.out.println("no salam");
		}
		*/
	
		System.out.println("remove ahmad only"+Jamsh);
		System.out.println("*************"+Jamsh.get(1));
		System.out.println(Jamsh);
	//ist.remove(2);
	//ystem.out.println("after removing element::"  +list);
		
//*********************************************************************************
		//Inserting a new element into Arrylist 
		
		Jamsh.add(1, "Hamid");
		System.out.println(Jamsh);
//list.add(0,"Abdul Basir2");
//System.out.println(list);
	//ist.add(4, "Hamid");
//System.out.println(list);
		
//*********************************************************************************
		
		// read values from  String array list using for loop 
		
		for ( String jam :Jamsh)
		{
			System.out.println(jam);
		}
		
		System.out.println("**************************************************");
		
		// create an ArrayList which going to 
        // contains a list of Numbers 
        ArrayList<Integer> Numbers = new ArrayList<Integer>(); 
  
        // Add Number to list 
        Numbers.add(23); 
        Numbers.add(32); 
        Numbers.add(45); 
        Numbers.add(63); 
  
        // apply removeIf() method 
        // we are going to remove numbers divisible by 3 
        Numbers.removeIf(m -> (m ==23||m==63)); 
  
        //Numbers.removeIf()
        // print list 
        for (int i : Numbers) { 
            System.out.println(i); 
        } 
     

		
		
//		for (String s :list)
//		{
//			System.out.println(s);
//		}
//***********************************************************************		
		// read values from  all datatype ( anytype of values) array list using for loop 

//
//		for (Object s :list)
//		{
//			System.out.println(s);
//		}
		
//************************************************************************************		
		
		
		
	}

}
