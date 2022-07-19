package dev.patika.java101;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		
		  int number, divider, sum = 0;

	      Scanner input = new Scanner(System.in);
	      System.out.print("Please enter a number: ");
	      number = input.nextInt();
	      input.close();
	      
	      for (int i = 1; i < number; i++) {
	            if (number % i == 0) {
	                divider = i;
	                sum += divider;
	            }
	      }
	      if (sum == number) {
	            System.out.println(number + " is a perfect number");
	      } else 
	        	System.out.println(number + " is not a perfect number");
	    }

	}


