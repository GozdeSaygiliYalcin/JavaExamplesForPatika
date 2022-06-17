package dev.patika.java101;

public class PrintingBWithArray {

	public static void main(String[] args) {
		// This is an example for 2d arrays which is creating "B" letter with using stars.
		
		String [][] letter = new String [7][4];
		
		for(int i=0; i<letter.length; i++) {
			for(int j=0; j<letter[i].length; j++) {
				
				if (i==0 || i==3 || i==6) {
					letter[i][j] ="*";
				} 
				else if(j==0 || j==3) {
					
					letter[i][j] ="*";
				}
				else {
					letter[i][j] =" ";
				}	
			}
		}
		
		for (String[] row : letter) {
			for (String col : row) {
				System.out.print(col);
			}
			System.out.println();
		}

	}

}
