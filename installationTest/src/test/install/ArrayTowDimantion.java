package test.install;

public class ArrayTowDimantion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		


//int[][] data2x3 = new int[2][3];
//
//        data2x3[0][0] = 10;
//        data2x3[0][1] = 15;
//        data2x3[0][2] = 20;
//        data2x3[1][0] = 25;
//        data2x3[1][1] = 30;
//        data2x3[1][2] = 35;
//
//        System.out.println(data2x3[0][0] + " " + data2x3[0][1] + " " + data2x3[0][2]);
//
//        System.out.println(data2x3[1][0] + " " + data2x3[1][1] + " " + data2x3[0][2]);
//
//       
        

String[][] data = new String[5][2];

        data[0][0] = "Sam";
        data[0][1] = "123";
        
        data[1][0] = "Bam";
        data[1][1] = "231";
        
        data[2][0] = "Mam";
        data[2][1] = "231";      
        
        data[3][0] = "Dam";
        data[3][1] = "312";      
        
        data[4][0] = "Wam";
        data[4][1] = "213";
        
        for (int outer = 0; outer < data.length; outer++) {
			for (int inner = 0; inner < data[outer].length; inner++) {
		System.out.print(data[outer][inner] + "    ");}
			System.out.println();
	}

}}
