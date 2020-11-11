package test.install;

public class ArrayPractice01 {

	public static void main(String[] args) {

		int []numbers = new int [5];
		
	numbers[0]=10;
	numbers[1]=15;
	numbers[2]=18;
	numbers[3]=25;
	numbers[4]=89;
	
	int sum=0;
	int average= (10+15+18+25+89)/5;
	for(int i=0;i<numbers.length;i++) {

	sum=sum+numbers[i];	
	System.out.println(numbers[i]  );

	}
	
	System.out.println("Average of all numbers: " + average);
	System.out.println("sum of all numbers:     " +sum);
	System.out.println( numbers.length);
		
	}

}
