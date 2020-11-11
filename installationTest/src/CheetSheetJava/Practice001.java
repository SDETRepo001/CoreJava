package CheetSheetJava;


public class Practice001 {

	public static void main(String[] args) {

		
		addition obj = new addition(); 
		obj.test();
		
		int e=obj.GetPlayersName().size(); 
		
	for (String a :obj.GetPlayersName() ) {
	
		
System.out.println(a);		
	}
	System.out.println(e);
	
	//non static call using object 
//	obj.empid=001;
//	obj.name="Abdul"; 
//	obj.postion="ceo"; 
//    obj.show();
 
	
	addition.empid=110; 
	addition.name="Jamshid"; 
	addition.postion="super ceo"; 
	addition.show(); 
	
 
	}
	
	
	
	

}
