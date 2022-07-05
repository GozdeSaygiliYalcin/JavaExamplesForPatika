package dev.patika.java101.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTranspoze {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int i, j;
		i = input.nextInt();
		j = input.nextInt();
		int[][] original = new int[i][j];
		int [][] transpose = new int[j][i];	
		
		for (int[] ks : original) {
			System.out.println(Arrays.toString(ks));
		}
		for (int[] ks : transpose) {
			System.out.println(Arrays.toString(ks));	
		}
	}
}
