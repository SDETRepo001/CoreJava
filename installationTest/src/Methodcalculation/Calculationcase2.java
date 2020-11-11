package Methodcalculation;

public class Calculationcase2 {

	// case 2. not taking parameters but returning  values 
	
	int x=10;
	int y=20; 
	
	
	
			int sum() 
		{

		return (x+y);
		
		}
		
		public static void main(String[] args) {

			
			Calculationcase2 cal = new Calculationcase2(); 
			
		int res=cal.sum();

		System.out.println(res);
		System.out.println(cal.sum());

		}

	}
