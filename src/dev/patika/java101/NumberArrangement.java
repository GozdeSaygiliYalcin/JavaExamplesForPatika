package dev.patika.java101;

import java.util.Scanner;

public class NumberArrangement {

	public static void main(String[] args) {
		// This code provides to sort the three entered numbers from largest to smallest.
		
		int num1, num2,num3;
		
		Scanner input = new Scanner(System.in);
		
			System.out.print("please enter the first number: ");
			num1 = input.nextInt();
		
			System.out.print("please enter the second number: ");
			num2 = input.nextInt();
					
			System.out.print("please enter the third number: ");
			num3 = input.nextInt();
			input.close();
			
			if (num1>num2 && num1>num3) {
				
				if(num2>num3) {
					   System.out.println(num1 + ">" + num2 + ">" + num3);
				}
				else {
						System.out.println(num1 + ">" + num3 + ">" + num2);
				}
			}
			else if(num2>num1 && num2>num3) {
				
				if(num1>num3) {
					System.out.println(num2 + ">" + num1 + ">" + num3);
				}
				else {
					System.out.println(num2 + ">" + num3 + ">" + num1);
				}

			}
			else if(num3>num2 && num3>num1) {
				
				if(num1>num2) {
					System.out.println(num3 + ">" + num1 + ">" + num2);
				}
				else {
					System.out.println(num3 + ">" + num2 + ">" + num1);
				}
			}
	}
}