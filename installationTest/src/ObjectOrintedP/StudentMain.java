package ObjectOrintedP;

public class StudentMain {

	public static void main(String[] args) {

		//1 . Assign values by using reference variable 
		Student stu1= new Student();
		
//		stu1.sid=1010; 
//		stu1.sname="John"; 
//		stu1.grade='A';
	
		// 2 assign values by using method variable 
		 stu1.getValues(1010, "John", 'A');
		
//		Student stu1= new Student (1010,  "John", 'A'); 
//		

		
	}

}
