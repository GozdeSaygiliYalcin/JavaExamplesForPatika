package dev.patika.java101;

import java.util.Scanner;

public class DrawReversedStarTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        int column ;
        System.out.print("Enter a number: ");
        column = input.nextInt();
        input.close();

	        for(int i = 0; i < column; i++) {
	            for(int j = 0; j <= i; j++) {
	                System.out.print(" ");
	            }
	            for(int k = 1; k <= ((2 * column) - 1 - (2 * i)); k++) {
	                System.out.print("*");
	            }
	            System.out.println(" ");
	    }
	}
}
