package Dayy051020;

public class StringsBasics {

	public static void main(String[] args) {

		String st1 = "Test";
		String st3= "Elephante";
		String st2 = new String ("test");
// method length retun the size of the String /number of char		
		System.out.println(st1.length());
		
		// method charAt will return a char at the specified index 
		System.out.println(st1.charAt(2));
		
		// indexOf will retun the index number of the first occurrence of the char
		System.out.println(st1.indexOf('e'));
		System.out.println(st1.indexOf('e',3));
		// substring () will return char
		System.out.println(st3.substring(5,8));
		
		System.out.println(st3.substring(5,8));
		
        //ToUpperCase and ToLowerCase it will change 
		//all the char to lower and upper case 
		System.out.println(st3.toLowerCase());
		System.out.println(st3.toUpperCase());
		
		
		//equals compare tow String while condidering the case of of char 
		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		//startswith will check to see if the string is staring with specified staring 
		
		System.out.println(st2.startsWith("t"));
		//Endswith will check to see if the string is ends with specified staring 
		
		System.out.println(st2.endsWith("e"));
		
		// contains basicly we are going to check if we have those char on the string or not 
		System.out.println(st2.contains("tes"));
		
		
		// replace 
		
		System.out.println(st3.replace('e', 'a'));
		System.out.println(st3.replace('E', 'j'));
		
		
		
		
	}
	
	
	

}
