package dev.patika.java101;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// This is an example that can calculate harmonical avarage for an array.
				
				Scanner input = new Scanner(System.in);
				System.out.print("plese enter a number you want to calculate as harmonic:");
				int n1 = input.nextInt();
				
				
				double sumHarm = 0;
				for(double i=1; i<n1; i++) {
					sumHarm=sumHarm+1/i;
				}
				double avarage = (n1)/sumHarm;
				System.out.println("Harmonic avarage is: " + avarage);
				input.close();

	}

}
