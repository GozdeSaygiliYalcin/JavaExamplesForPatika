package dev.patika.java101.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOrder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the elements of the array: ");
	    int number = input.nextInt();
	    
	    int[] n1 = new int[number];
	    for(int i = 0; i < number; i++){
	        n1[i]=input.nextInt();
	    }

	        input.close();

		        // Prints each sequential element in array n1
		        for (int i = 0; i < n1.length; i++) {
		            System.out.println((i+1) +"." +" element is: " +n1[i]);
		        }
		        
		        System.out.println("The sorted int array is:"); 
		        Arrays.sort(n1);
		        System.out.print(Arrays.toString(n1));
    }
}


