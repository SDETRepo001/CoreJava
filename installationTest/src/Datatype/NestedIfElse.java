package Datatype;

public class NestedIfElse {

	public static void main(String[] args) {

		int day=4;
		String a = "dfd";
				if (day==1 && a == "dfd")
		{
			System.out.println("Sunday");
			
		}
		else if (day==2)
		{
			System.out.println("Monday");
		}
		
		else if(day==3)
		{
			System.out.println("Thusday");
			
		}
		
		else if (day==4)
	
		{		System.out.println("Wednesday");
	
		}
		else if (day==5)
		{
			System.out.println("Thursday");
		}	
		
		else if (day==6)
		{
			System.out.println("Friday");
		}
		else if (day==7)
		{
			System.out.println("Saturday");
		}
		
		else {
		System.out.println("Invalid Week number");
		
		}
	}

}
