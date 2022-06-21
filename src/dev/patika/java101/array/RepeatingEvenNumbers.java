package dev.patika.java101.array;

import java.util.Arrays;

public class RepeatingEvenNumbers {
	
	public static boolean isFind( int[] arr, int value) {
		
		for (int i : arr) {
			if(i==value) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// This is an example that can calculate repating even numbers
		
		int [] list = {3,4,6,8,9,12,78,6,4,9};
		int [] newList = new int[list.length];
		int startindex = 0;
		
		for (int i = 0; i < list.length; i++) {
			for(int j = 0; j<list.length; j++) {
				if(i!=j && (list[i]==list[j])&& list[i]%2==0) {

					if(!isFind(newList, list[i])) {
					newList[startindex++] = list[i];	
					}
					break;
				}
			}
		}
		for(int value:newList) {
			if(value !=0) {
			System.out.print(value + " ");
			}
		}
		System.out.println(" :following even number(s) is/are repeating in this list");
	}
}

