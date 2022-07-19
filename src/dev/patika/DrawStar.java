package dev.patika;

import java.util.Scanner;

public class DrawStar {
	
	private Scanner input;
	
	public void drawStarTriangle(int row, int column) {
		
		input = new Scanner(System.in);
		row = input.nextInt();
		column = input.nextInt();
		
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <column; j++) {
				 System.out.print(" ");		
			}
			for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
			}
			 System.out.println(" ");
		}
	}
	
	public void drawDiamond(int row) {
		input = new Scanner(System.in);
		row = input.nextInt();
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= row-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= ( 2 * i - 1 ); k++) {
                System.out.print("*");
			}
			System.out.println(" ");
		}
		for (int i = 1; i < row; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(" "); 
            }
            
            for (int j = 1; j <= ( 2 * row - (2 * i + 1) ); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
         }
	}

	public static void main(String[] args) {
		
		DrawStar shape = new DrawStar();
//		shape.drawStarTriangle(5, 5);
		shape.drawDiamond(6);

	}

}
