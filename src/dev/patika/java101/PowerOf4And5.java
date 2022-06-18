package dev.patika.java101;

import java.util.Scanner;

public class PowerOf4And5 {

	public static void main(String[] args) {
		//This code calculates the power of the 4 and 5 until the number that is entered.
		
		System.out.println("Please enter ending number to calculate power of the 4 and 5");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = 1; i < n; i*=4) {
			System.out.print(i + ",");
			
		}
		System.out.println();
		for (int i = 1; i < n; i*=5) {
			System.out.print(i + ",");
			
		}
	}

}
