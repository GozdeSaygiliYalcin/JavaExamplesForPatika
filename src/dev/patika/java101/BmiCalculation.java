package dev.patika.java101;

import java.util.Scanner;

public class BmiCalculation {

	public static void main(String[] args) {
		// This code provides body mass index calculation
		double height, weight, bmi;
		String gender= "W";
	
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter your gender W or M");
		gender = input.next();
		
		System.out.println("Enter your height");
		height = input.nextDouble();
		
		System.out.println("Enter your weight");
		weight = input.nextDouble();
		
		bmi = weight * (10000/(height*height));
		
		if (gender.equalsIgnoreCase("W")) {
		
		}if(bmi<19) {
			System.out.println("Underweight");
			
		}else if(bmi<24) {
			System.out.println("Normal");
			
		}else if(bmi<30) {
			System.out.println("Overweight");
		
		}else if(gender.equalsIgnoreCase("M")) {
			
		}if(bmi<20) {
			System.out.println("Underweight");
			
		}else if(bmi<25) {
			System.out.println("Normal");
			
		}else if(bmi<30) {
			System.out.println("Overweight");
			
		}else {
		System.out.println("Obese");
		input.close();
	}

}
}