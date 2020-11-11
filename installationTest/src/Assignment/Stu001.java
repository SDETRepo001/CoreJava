package Assignment;

public class Stu001 {


		
		int sid; 
		String sname; 
		int sub1;
		int sub2;
		int sub3;
		
		
		void getstudata(int id, String name)
		{
			sid =id;
			sname=name; 
	
		}
		
		void getmarks(int a, int b, int c)
		{
			
			sub1=a;
			sub2=b;
			sub3=c; 
			
		}
		
		void totalmarks()
		{
			
			double avg=(sub1+sub2+sub3)/3;
			System.out.println("The average is"+ avg);
			System.out.println("Student details"+ sid+','+ sname);
		}
		
		public static void main(String[] args) {
			
			
			Stu001 stu1 = new Stu001 (); 
			Stu001 stu2 = new Stu001 (); 
			Stu001 getmark= new Stu001();
			Stu001 getmark1= new Stu001();
			
			
			
			
			stu1.getstudata(001, "Abdul");
			stu2.getstudata(002, "Jamshid");
			getmark.getmarks(50, 60, 90);
			getmark1.getmarks(80, 90, 100);

			stu1.totalmarks();
			stu2.totalmarks();
			getmark.totalmarks();
			getmark1.totalmarks();
			
			
			
			
			
		}
			
		}
		
		
		
	



