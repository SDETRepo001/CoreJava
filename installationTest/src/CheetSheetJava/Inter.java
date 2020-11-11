package CheetSheetJava;


interface ab{
	
	int a=100;// final public
	

    void show (); 
    
	
	
	
}


public class Inter  implements ab{
	
	public void show() {
		System.out.println(a);
	}
     
	
	
	
	
	public static void main(String[] args) {
		
	
		
	ab call= new Inter(); // first method to make obj
	
	call.show();
	

	
     
	

	}

	
	
	
	
	
	
	


	}


