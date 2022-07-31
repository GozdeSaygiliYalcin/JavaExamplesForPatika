package dev.patika.java101;

import java.util.Scanner;

public class OddNumberLoop {
	
	private static Scanner input = new Scanner(System.in);

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// This is an example that that accepts input from the user until a single number is entered with 
		//Java loops and adds even and multiples of 4 from the entered values and prints it on the screen

		int recNum;
		int total = 0;
		int counter=0;
		
		do {	
			
			System.out.print("please enter a number: ");
			recNum =input.nextInt();
			if(recNum%4 == 0 && recNum%2 == 0 ) {
				total += recNum;
			    counter++; 
			}
	
		}  while(recNum%2 == 0);
		
		System.out.println("the even and multiples of 4 from the entered values are: " +total);
	}
	
}


