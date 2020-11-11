package LabWorks;

public class No002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. Create below Patterns:
//
//			A: 
//
//			*
//
//			**
//
//			***
//
//			****
//
//			*****
//
//			B: 
//
//			*****
//
//			****
//
//			***
//
//			**
//
//			*
//
//			C: 
//
//			*
//
//			**
//
//			***
//
//			****
//
//			*****
//
//			****
//
//			***
//
//			**
//
//			*
//
//			2. Reverse Following String in Console:
//
//			"Test Automation Engineer"
//
//			3. Specify the greatest Number:
//
//			int x = 600;
//
//			int y = 700;
//
//			int z= 300;
//
//			4. Reverse following number:
//
//			1234

		System.out.println("A:\n* \n**\n***\n****\n*****\n" + "B: \n*****\n****\n***\n**\n*\n*\n**\n***\n****\n*****"
				+ "2: \n\'Test Automation Engineer'");

		int x = 600, y = 700, z = 300;
		if (x > y && x > z)

		{

			System.out.println("Largest number is:" + x);

		}

		else if (y > z)

		{

			System.out.println("Largest number is:" + y);

		}

		else

		{

			System.out.println("Largest number is:" + z);

		}

		int num = 1234;
		int rev = 0;

		while (num != 0) {

			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println("reverse Number is ::" + rev);
	}

}
