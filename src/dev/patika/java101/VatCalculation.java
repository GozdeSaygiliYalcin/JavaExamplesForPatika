package dev.patika.java101;

import java.util.Scanner;

public class VatCalculation {

	public static void main(String[] args) {
		double endPrice = 0;
		double rawPrice;
		double VAT1 = 0.18;
		double VAT2 = 0.08;

		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the raw price: ");
		rawPrice = input.nextDouble();
		
		if(rawPrice<1000 && rawPrice>0) {
		rawPrice += rawPrice*VAT1;
		} else if(rawPrice>1000 ) {
		rawPrice += rawPrice*VAT2;
		}
		endPrice=rawPrice;
		System.out.println("VAT included amount is: " +endPrice);
		input.close();
		
	}

}
