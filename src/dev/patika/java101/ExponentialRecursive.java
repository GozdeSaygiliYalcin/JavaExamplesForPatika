package dev.patika.java101;

import java.util.Scanner;

public class ExponentialRecursive {
		
	private static  Scanner input = new Scanner(System.in);
	
	private static int result = 1;
	
    public  static int sum(int numberOne, int numberTwo) {
        if (numberOne == 0){
            return 1;
        }
        result *= numberTwo;
        sum(numberOne-1, numberTwo);
        
        return result;

    }    
	public static void main(String[] args) {
		
		int numberOne, numberTwo;

        System.out.print("Enter Base Number : ");
        numberTwo = input.nextInt();
        
        System.out.print("Enter Exponents Number : ");
        numberOne = input.nextInt();

        System.out.println(sum(numberOne,numberTwo));

	}

}
