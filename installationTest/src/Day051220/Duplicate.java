package Day051220;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {

		
		
	    String duplicates[] = new String [] { "Automation", "Test","Automation", "Job","Test"};
	    
	    Set nonDuplicatesSet=new HashSet<>();
	    Set duplicatesSet=new HashSet<>(); 
	    
	    for (String string : duplicates) {
			
	    	if (!nonDuplicatesSet.contains(string)) {
	    		nonDuplicatesSet.add(string); 
	    	}
	    	else {
	    		duplicatesSet.add(string); 
	    	}
		}
	  System.out.println(duplicatesSet);
		
	}

}
