package date043020;

public class Student {

	public  String name;
	public int age;
	//defult Constractor method 
	public Student() {
	
		name="";
		age=0;	
	}	

	// Parameterized constructor method
	public Student(String newName, int newAge) { 
		
		name = newName;
		age  = newAge;
	}
		public Student (String newName) { 
 
			name = newName;
			age=0;
		
		}
	}
