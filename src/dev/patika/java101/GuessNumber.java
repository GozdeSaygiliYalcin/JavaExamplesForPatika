package dev.patika.java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*0-100 arasında rastgele seçilen bir sayıyı 
 * kullanıcının tahmin ettiği bir 
 * "Sayı Tahmin Oyunu" */

public class GuessNumber {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int guessNumber = rnd.nextInt(100);
		
		Scanner input = new Scanner(System.in);
		
		int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        
        System.out.println(guessNumber);
        
        while(right < 5) {
        	System.out.print("please enter your guess: ");
        	selected = input.nextInt();
        	
        	if(selected < 0 || selected > 99) {
        		System.out.println("wrong selection, please enter a number between 0-100");
        		
        		if(isWrong) {
        			right++;
        			System.out.println("remaining selectiion right is: " + (5-right));
        		}
        		else {
        			isWrong = true;
                    System.out.println("Your remaining will be decreased");
        		}
        		continue;
        		}
        		
        		if(selected == guessNumber) {
        			System.out.println("congrulations! you found the number");
        			isWin = true;
        			break;
        		}
        		else {
        			System.out.println("wrong entry, please try again");
        			
        			if(selected > guessNumber) {
        				System.out.println("the number that you want to guess is smaller than this selection");
        			}
        			else {
        				System.out.println("the number that you want to guess is bigger than this selection");
        			}
        			 wrong[right++] = selected;
                     System.out.println("remaining choice right is: " + (5 - right));
        		}
        	}
        
	        if (!isWin) {
	            System.out.println("You lost the game ! ");
	            if (!isWrong) {
	                System.out.println("Your guess are: " + Arrays.toString(wrong));

	            }	
	        }
	        input.close();
	}
}
