package CheetSheetJava;

import java.util.ArrayList;

//import java.util.ArrayList;


public  class addition {
	

	 
	public int sum (int a, int b) {
	
		
		  int sum= a+b;
		  return sum; 
	}
	
	public void test() {
System.out.println("bad guys");	}
	


public ArrayList <String> GetPlayersName(){
	System.out.println("GetPlayerName");
	ArrayList <String> ar= new ArrayList<String>(); 
	ar.add("Jamshid"); 
	ar.add("Abdul"); 
	ar.add("hamidi"); 
	return ar; 
}

	public String getcountryCapital(String CountryName) 
	{
		
		System.out.println("GetCountryName"); 
		if (CountryName .equals("Afghanistan")) 
			System.out.println("Kabul"); 
			else if (CountryName.equals("USA") )
			System.out.println( "Washington DC"); 
			else if (CountryName.equals("Iran"))
				System.out.println("Tahran");
			else 
				System.out.println("no country");
				return CountryName; 
	
			
	}
	
	 int empid; 

      String name; 

     String postion; 
	
	 public void show() {
		System.out.println(empid);
		System.out.println(name);
		System.out.println(postion);
	}
	

	 

	
	
	

}

