package dev.patika.java101;

import java.util.Scanner;

public class LessonPassingStatus {

	public static void main(String[] args) {
				// This is an example that shows class passing status according to your grade.
				// In order to pass minimum grade must be 55.
				
				
		int lessonMusic,lessonMath, lessonChem,lessonPhysics;
		double avarage;
				
			
		Scanner input =new Scanner(System.in);
				
			while(true) {
				
				System.out.print("Your music note is: ");
				lessonMusic= input.nextInt();
				
				
				System.out.print("Your math note is: ");
				lessonMath= input.nextInt();
				
			
				System.out.print("Your chem note is: ");
				lessonChem= input.nextInt();
				
			
				System.out.print("Your physics note is: ");
				lessonPhysics= input.nextInt();
				
					
				if (lessonMusic <= 0 || lessonMusic >= 100 || lessonMath <= 0 || lessonMath>= 100 || lessonChem <= 0 || lessonChem>= 100 || lessonPhysics <=0 || lessonPhysics >=100 ) {
					System.err.println("ERROR! cannot resolve this numbber, please enter again");
					continue;
				}
				avarage = (lessonChem+lessonMath+lessonMusic+ lessonPhysics)/4;
				input.close();
			
				if(avarage<55)  {
				System.out.println("You failed");
				break;
			}	else {
				System.out.println("You passed congrulations!");
				break;
				}
			}
		}
}

