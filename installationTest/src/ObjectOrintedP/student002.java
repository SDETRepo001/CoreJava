package ObjectOrintedP;

public class student002 {
	
	
	
	int sid; 
	String sname; 
	char grade; 
	
	void getValues(int id, String name, char g)
	{
		
		 sid=id; 
		 sname=name; 
		 grade=g;
	}
	
		void display()
	{
		System.out.println(sid+"  "+sname+"  "+grade);
		
	}

}
