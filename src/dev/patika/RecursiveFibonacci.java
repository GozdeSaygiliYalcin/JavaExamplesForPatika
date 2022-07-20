package dev.patika;

import java.util.Arrays;
import java.util.Scanner;

public class RecursiveFibonacci {
	
	private static Scanner input = new Scanner(System.in);
	
	private static int fibonacci(int n) { //recursive metod ile fibonacci elemanlarını buluyor
		
        if(n == 0 || n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    } 

	private static int [] printFib(int n) { 
		
		int myInputNum = input.nextInt();
		int [] list = new int[myInputNum];
		for(int i = 0; i < myInputNum ; i++) {
			list[i] = fibonacci(i);
        }
		System.out.println(Arrays.toString(list));
		return list;
	}
	
	private static void findIndex(int [] list) {
		
		int myNumber = input.nextInt();
		int min = Integer.MIN_VALUE;
		int i;
		list = printFib(myNumber);
		for (i = 0; i < list.length; i++) {
			if(list[i] <= myNumber) {
			min =list[i];
			}
		}	
		System.out.println("the (closest) value is:" + min);
		System.out.println("the index number is:" + (i-1));
		
	}
	
	public static void main(String[] args) {
		
		int n = input.nextInt();
		int [] arrayN = printFib(n);
		
		findIndex(arrayN);
		
	}
		
	
}