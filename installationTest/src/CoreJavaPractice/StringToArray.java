package CoreJavaPractice;

public class StringToArray {

	public static void main(String[] args) {

		String names = "Ahmad Mohammmod Jamid"; 
		
		char []Names = names.toCharArray(); 	
		
		System.out.println(Names.length);
		
		for (int i = 0; i < Names.length; i++) {
			
			System.out.print(Names[i]);
			
		}
		
		
	}

}
