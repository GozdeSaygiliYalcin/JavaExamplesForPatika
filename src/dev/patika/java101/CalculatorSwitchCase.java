package dev.patika.java101;

import java.util.Scanner;

public class CalculatorSwitchCase {

	public static void main(String[] args) {
		// This is a simple calculator that can do basic operations.
		int n1, n2;
		char process;
		int result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter first number: ");
		n1 = input.nextInt();
		
		
		System.out.print("enter second number: ");
		n2 =input.nextInt();
		
		System.out.println("enter an operator +, -, *, / ");
		process = input.next().charAt(0); //it takes only the first character of a text
		
		
		switch(process) {
		case '+':
			result = (n1+n2);
			break;
		case '-':
			result = (n1-n2);
			break;
		case '*':
			result = (n1*n2);
			break;
		case '/':
			result = (n1/n2);
		
		default:
			System.out.println("error");
			input.close();
			return;
	}
		
		System.out.println("the result is" + " " + result);
		input.close();
	}

	
}


