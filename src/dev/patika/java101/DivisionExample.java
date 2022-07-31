package dev.patika.java101;

import java.util.Scanner;

public class DivisionExample {

	public static void main(String[] args) {
		// This is an example that calculates the average of numbers divisible by 3 and 4 from numbers 0 to the number entered with Java loops 
		
		int received;
		int total=0;
		int counter=0;
		double avarage;
		
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the number that you wanted to end the loop: ");
		received =input.nextInt();
		
		for(int i=0; i<=received; i++)  {
			if(i%3==0 && i%4==0)
				total += i;
			    counter++;
			  
		}
		avarage = total/counter;
		System.out.println("the avarage is: " + avarage);
		input.close();
	}

}
