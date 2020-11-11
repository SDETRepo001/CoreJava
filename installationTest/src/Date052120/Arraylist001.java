package Date052120;

import java.util.ArrayList;

public class Arraylist001 {

	public static void main(String[] args) {

		String []fruits = new String [5]; 
		
		fruits[0] = "Mango"; 
		fruits [1]= "Apple"; 
		fruits [2]= " Straberry"; 
		fruits [3]= "grape"; 
		fruits [4]= "banana"; 
		
		
		System.out.println(fruits[4]);
		
        ArrayList <String>fruitlist =new ArrayList <String>();
        
        
        System.out.println("ArrayList");
        
		fruitlist.add("Mango"); 
		fruitlist.add("Apple"); 
		fruitlist.add("Straberry"); 
		fruitlist.add("banana"); 
		fruitlist.add("etc"); 
		fruitlist.add("Etcccc"); 
		
		System.out.println(fruitlist.indexOf(fruitlist));

		
		
	}

}
