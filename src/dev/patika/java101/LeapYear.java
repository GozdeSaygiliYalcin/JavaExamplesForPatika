package dev.patika.java101;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		int year;
		boolean isLeap = false;
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a year: ");
		year = input.nextInt();
		
		 if (year > 0) {
	            if (year % 4 == 0) {
	                if (year % 100 == 0) {
	                    if (year % 400 == 0) {
	                        isLeap = true;
	                    } else {
	                        isLeap = false;
	                    }
	                } else {
	                    isLeap = true;
	                }
	            } else {
	                isLeap = false;
	            }
	            if (isLeap) {
	                System.out.print(year + " is leap year ");
	            } else {
	                System.out.print(year + " is not leap year");
	            }
	        } else {
	            System.out.print("Incorrect login ");
	        }
		 input.close();
	}
}