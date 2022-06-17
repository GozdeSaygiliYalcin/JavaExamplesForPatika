package dev.patika.java101;

import java.util.Scanner;

public class AreaOfTheCircle {

	public static void main(String[] args) {
		// This is the method to find the area of a circle segment with radius r and measure 𝛼 of the central angle.
		
		double radius;
		int angle;
		double PI =3.14;
		double circleArea;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the radius of the circle: ");
		radius = input.nextDouble();
		System.out.print("Please enter the angle of the radius you want to calculate: ");
		angle = input.nextInt();
		
		circleArea = (PI*(Math.pow(radius, radius))*angle)/360;
		System.out.println("The area of the piece is: " + circleArea);
		input.close();	
	}
}
