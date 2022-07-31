package dev.patika.java101;

import java.util.Scanner;

public class PassingStatus {
	
	private static Scanner input =new Scanner(System.in);

	public static void main(String[] args) {
		// This is an example that shows class passing status according to your grade.
		// In order to pass minimum grade must be 55.
		
		
		int lessonMusic = 0, lessonMath=0, lessonChem=0, lessonPhysics=0;
		double avarage;

		
		do {
			
			System.out.print("Your music note is: ");
			lessonMusic= input.nextInt();
			
//				if(lessonMusic < 0 || lessonMusic > 100) {
//				System.err.println("ERROR! please enter again");
//				}
			
			System.out.print("Your math note is: ");
			lessonMath= input.nextInt();
			
		
			System.out.print("Your chem note is: ");
			lessonChem= input.nextInt();
			
		
			System.out.print("Your physics note is: ");
			lessonPhysics= input.nextInt();
		
			
		}while (lessonMusic >= 0 && lessonMusic <= 100 && lessonMath >= 0 && lessonMath<= 100 && lessonChem >= 0 && lessonMath<= 100 ); 
		
		avarage = (lessonChem+lessonMath+lessonMusic+ lessonPhysics)/4;
		
		if(avarage<55)  {
			System.out.println("you failed");
		}	else {
			System.out.println("you passed congrulations!");
		
			}
	
	}
}


