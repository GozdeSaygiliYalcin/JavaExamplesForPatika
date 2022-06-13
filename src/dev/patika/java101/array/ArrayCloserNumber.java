package dev.patika.java101.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCloserNumber {

	
	public static void main(String[] args) {
		// This code sample allows to find the nearest number
		
				int min = 0;
				int max = 0;
				int [] list = {15, 12,788,1,-1, -788, 2, 0};
				
				Arrays.sort(list); //This provides quick sort min to max
				
				Arrays.toString(list);
			
				System.out.print("please enter a number:");
				Scanner input =new Scanner(System.in);
				int myNumber =input.nextInt();
				
				for (int i=0; i<list.length; i++) {
					if(list[i]<myNumber) {
					min =list[i];
					max = list [i+1];
				}
		}		
				System.out.println("The sorted list is: " + Arrays.toString(list));
				System.out.println("The closest minimum valıue is: "+min);
				System.out.println("The closest maximum value is: "+ max);
	}
}
