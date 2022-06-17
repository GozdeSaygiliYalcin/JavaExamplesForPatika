package dev.patika.java101;

import java.util.Scanner;

public class WeatherConditionEvent {

	public static void main(String[] args) {
		// This is an example that suggests an activity, according to the weather condition.
		
		int weatherCond;
		
		Scanner input = new Scanner(System.in);
		System.out.print("please enter the weather in your location as celcius: ");
		weatherCond =input.nextInt();
		input.close();
		
			if(weatherCond<5) {
				System.out.println("you should go to Ski");
			}
			else if(weatherCond<15) {
				System.out.println("you should see the new movie in the cinema");
			}
			else if(weatherCond<25) {
				System.out.println("you can go to the picnic in this sunny day");
			}
			else if(weatherCond>25) {
				System.out.println("you can go to the beach for a swim");
			}
	}
}

