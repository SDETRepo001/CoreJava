package Dayy051020;

public class MutationParactice {

	public static void main(String[] args) {

		
 String x = "test";		
		System.out.println(x);
		
		
		// Mutable (Mutation) basickly it doesn't change the location on memory stack
		String st="test";
		StringBuffer sb= new StringBuffer("Test");
		
		
		// examples mutable 
		
		for(int i =0; i<10; i++){
			st.replace('t', 'T');
			
			
			st +=i+1;
		sb.append(i+1);
		
		System.out.print("sb "+ st +"\t\t\t\t");
		System.out.println("st "+ sb);
		}
		
		
	}

}
