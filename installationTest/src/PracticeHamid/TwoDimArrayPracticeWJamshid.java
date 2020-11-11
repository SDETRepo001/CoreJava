package PracticeHamid;

public class TwoDimArrayPracticeWJamshid {

	public static void main(String[] args) {
		
		
		
		int[][] a = new int[3][4][2];

		a[0][0] = 233;
		a[0][1] = 23243;
		a[0][2] = 23243;
		
		a[1][0] = 234;
		a[1][1] = 234;
		a[1][2] = 234;
		
		a[2][0] = 234;
		a[2][1] = 23324;
		a[2][2] = 23324;
		
		a[3][0] = 2342;
		a[3][1] = 243;
		a[3][2] = 23324;
		
		a[4][0] = 2334;
		a[4][1] = 23234;
		a[5][0] = 2334;
		a[5][1] = 223243;
		a[6][0] = 233;
		a[6][1] = 2343;

		for (int i=0; i<a.length;i++)
		    for (int j=0;j<a[i].length;j++)
		    	
		    	System.out.println(a[i][j]);
		
		
	}

}
