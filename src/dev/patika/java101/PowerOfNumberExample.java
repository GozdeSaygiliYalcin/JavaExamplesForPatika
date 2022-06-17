package dev.patika.java101;

import java.util.Scanner;

public class PowerOfNumberExample {

	public static void main(String[] args) {
		// This is an example that provides to calculate power of number four and five.
		
		int received;
		int i = 1;
		int exponent1 =4;
		int result=1;
	
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the number that you wanted to end the loop: ");
		received =input.nextInt();
		
			while(exponent1>0) {
				
				if(i<=received) {
					result =result*i;
					exponent1--;
					
					
				}
			
				System.out.println(result);
		
		
			}
	}
}