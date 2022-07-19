package dev.patika.java101.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScannerMinMax {
	
	private static Scanner input;
	
	public static int [] fillArray(int n) {
		System.out.println("please enter the numbers of the array");
		input = new Scanner(System.in);
		int [] fillingArray = new int [n];
		
		for (int i = 0; i < n; i++) {
			fillingArray[i] = input.nextInt();
		}
		System.out.println(Arrays.toString(fillingArray));
		
		return fillingArray;
	}
	
	public static void calculateMinMax(int [] fillingArray) {
		int min;
		int max;
		
		Arrays.sort(fillingArray);
		min = fillingArray[0];
		max = fillingArray[fillingArray.length-1];
		System.out.println("the minimum number is " + min);
		System.out.println("the maximum number is " + max);
	}

	public static void main(String[] args) {
		
		int [] arrayN = fillArray(5);
		calculateMinMax(arrayN);

	}

}
