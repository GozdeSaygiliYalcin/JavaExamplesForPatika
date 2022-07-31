package dev.patika.java101;

import java.util.Scanner;

public class PrimeNumberScanner {
	
 	private static Scanner input = new Scanner(System.in);
	
	  static boolean checkPrime(int number,int index){
	        if(number <= 2) {
	            return (number == 2)?true:false;
	        }
	        if(number % index == 0){
	            return false;
	        }
	        if(index * index > number){
	            return true;
	        }
	        return checkPrime(number,index+1);
	    }

	public static void main(String[] args) {
		//Prime number finder according to the number that is taken from the scanner
		 
	        while(true){
	            System.out.print("Please enter a number: ");
	            int number=input.nextInt();
	            
	            if(checkPrime(number, 2)){
	                System.out.println(number + " is a prime number");
	            }
	            else {
	                System.out.println(number+" is not a prime number");
	            }
	        }
	}
}
