package dev.patika.java101;

public class NumberOfDigitsSum {
	
	public static int sumOfDigits(int number) {
		
		if(number == 0) {
			return 0;
		} else
		return number%10 + sumOfDigits(number/10);
	}

	public static void main(String[] args) {
		
		System.out.println("the number of the digits: " + sumOfDigits(1643));
		
		}
}
