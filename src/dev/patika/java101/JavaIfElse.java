package dev.patika.java101;

import java.util.Scanner;

public class JavaIfElse {

	public static void main(String[] args) {
		
		int n;
		
		Scanner input = new Scanner(System.in);
		n =input.nextInt();
		
		
			if(n%2 != 0) {
				System.out.println("Weird");
				
			} else if(n%2 == 0 && n<5 && n>2) {
				System.out.println("Not Weird");
				
			} else if(n%2 == 0 && n <=20 && n>=6) {
				System.out.println("Weird");
				
				
			} else if(n%2 == 0 && n>20) {
				System.out.println("Not Weird");
				
			} else if( n<1 || n>100) {
		
		input.close();
		System.out.println("Invalid number");
	}	
}
}