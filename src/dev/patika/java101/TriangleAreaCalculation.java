package dev.patika.java101;
import java.util.Scanner;

public class TriangleAreaCalculation {

	public static void main(String[] args) {
		int side1;
		int side2;
		int side3;
		double areaOfTriangle;
		double halfLength;
	
		
		Scanner input =new Scanner(System.in);
		System.out.print("please enter the length of first side: ");
		side1=input.nextInt();

		System.out.print("please enter the length of second side: ");
		side2=input.nextInt();
		
		System.out.print("please enter the length of third side: ");
		side3=input.nextInt();
		
		halfLength= (side1+side2+side3)/2;
		areaOfTriangle = halfLength*(halfLength-side1)*(halfLength-side2)*(halfLength-side3);
		System.out.print("The area of the triangle is: " + Math.sqrt(areaOfTriangle)); //this formule allows to take the square root.
		input.close();
	}

}
