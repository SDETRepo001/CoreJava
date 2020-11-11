package ArraysPractice;

public class TwoOrMultiDimArray {

	public static void main(String[] args) {

		int a[][]=new int [3][2];
		
		a[0][0]=100; 
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		int b[][]= {{100,200},{300,400},{500,600},{700,800}};
		
		System.out.println("Number of Rows:"+ b.length);
				System.out.println("Number of Colums:  "+b[0].length );
		
		
		for (int i=0;i<b.length;i++)// outer loop 
			for (int j=0; j<b[i].length;j++)//inner loop
			{
	System.out.println(b[i][j]);		


	
			}
		
		
		System.out.println("last one");
	int c [][]= new int [2][2]; 
	
	c[0][0]=100;
	c[0][1]=200;
	c[1][0]=300;
	c[1][1]=400;
	
	for (int e=0;e<c.length;e++)
		for (int f=0;f<c[e].length;f++)
		{
			System.out.println(c[e][f]);
			
		}
	
	
	
	
	
	
			
		

		
		
		
	}

}
