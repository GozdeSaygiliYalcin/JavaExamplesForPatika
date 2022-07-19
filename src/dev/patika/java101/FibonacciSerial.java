package dev.patika.java101;

import java.util.Scanner;

public class FibonacciSerial {

	public static void main(String[] args) {
		
		int n1 = 0; 
		int n2 = 1;
		int n3;
		int input;

		Scanner o1 = new Scanner(System.in);
		System.out.println("This is Fibonacci sequence. How many sequence length do you want to print?");
		input =o1.nextInt();
		System.out.print(n1+" "+n2); //0 ve 1 yazdırılması, bunlar sabit
		o1.close();
		 
			for(int i = 2; i < input; i++) {
				 n3=n1+n2;  
				 System.out.print(" "+n3);  
				 n1=n2;  
				 n2=n3;  
			}
				 System.out.println();
	}
		
}

