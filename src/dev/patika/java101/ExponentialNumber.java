package dev.patika.java101;

import java.util.Scanner;

public class ExponentialNumber {

	public static void main(String[] args) {
		
		int entered;
		int exp;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number that you want to calculate exponential");
		entered = input.nextInt();
		System.out.println("Please enter the exponential");
		exp = input.nextInt();
		
			int result = 1;
			for (int i = 1; i <= exp; i++) { //bu döngü üslü sayı hesaplıyor
				result = result*entered;
			}
		System.out.println("Exponential number is: " + result);
		input.close();
	}

}
