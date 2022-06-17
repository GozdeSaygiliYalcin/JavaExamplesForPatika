package dev.patika.java101;

import java.util.Scanner;

public class GroceryStoreProgram {

	public static void main(String[] args) {
		// This code example includes calculation methods for fruit and vegetables in the grocery store
		
		double pricePear = 2.14;
		double kgPear;
		
		double priceApple = 3.67;
		double kgApple;
		
		double priceTomatoes = 1.11;
		double kgTomatoes;
		
		double priceBanana = 0.95;
		double kgBanana;
		
		double priceEggplant = 5.00;
		double kgEggplant;

		Scanner input = new Scanner(System.in);
		System.out.print("please enter the amount of the pear: ");
		kgPear = input.nextDouble();
		
		System.out.print("please enter the amount of the apple: ");
		kgApple = input.nextDouble();
		
		System.out.print("please enter the amount of the tomatoes: ");
		kgTomatoes = input.nextDouble();
		
		System.out.print("please enter the amount of the banana: ");
		kgBanana = input.nextDouble();
		
		System.out.print("please enter the amount of the eggplant: ");
		kgEggplant = input.nextDouble();
		
		double totPricePear = pricePear*kgPear;
		double totpriceApple =priceApple*kgApple;
		double totpriceTomatoes = priceTomatoes*kgTomatoes;
		double totpriceBanana = priceBanana*kgBanana;
		double totpriceEggplant =priceEggplant*kgEggplant;
		
		double total = (totPricePear+totpriceApple+totpriceBanana+totpriceTomatoes+totpriceEggplant);
		
		System.out.println("the amount of the pear is: " +kgPear + " price is: " +totPricePear);
		System.out.println("the amount of the apple is: " +kgApple+ " price is: " + totpriceApple);
		System.out.println("the amount of the tomatoes is: " +kgTomatoes + " price is: " +totpriceTomatoes);
		System.out.println("the amount of the banana is: " +kgBanana + " price is: " +totpriceBanana);
		System.out.println("the amount of the eggplant is: " +kgEggplant + " price is: " +totpriceEggplant);
		System.out.println("the total amount you have to pay is: " +total);
		input.close();
	}

}
