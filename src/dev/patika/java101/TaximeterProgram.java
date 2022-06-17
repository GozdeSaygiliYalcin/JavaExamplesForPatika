package dev.patika.java101;

import java.util.Scanner;

public class TaximeterProgram {

	public static void main(String[] args) {
		int openingFee = 10;
		double minFee = 20;
		double feeKm = 2.20;
		int lengthKm;
		double totalFee;
		
		Scanner input =new Scanner(System.in);
		System.out.print("how many kilometers did you travel?: ");
		lengthKm =input.nextInt();
		
		totalFee = openingFee + (lengthKm*feeKm);
				
			if(totalFee<minFee) {
				System.out.println("The amount you have to pay is: " + minFee);
			} else {
				System.out.println("The amount you have to pay is: "+ totalFee);
				input.close();
			}
		

	}

}
