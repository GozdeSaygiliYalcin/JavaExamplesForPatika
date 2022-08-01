package dev.patika.java101;

import java.util.Scanner;

public class PatternMethod {
	
	public static void pattern() {
		
        Scanner input = new Scanner(System.in);
        System.out.print("Number N:");
        int n = input.nextInt();
        int a = n;
        	
        System.out.print("Print is: " +  n + " ");
        
        for (int i = n; i >= 0; i--) {
            n -= 5;
            System.out.print(n + " ");
            if (n <= 0) {
                for (int j = n; j <= a; j++) {
                    n += 5;
                    System.out.print(n + " ");
                    if (n == a) {
                        break;
                    }
                }
                break;
            }
        }
        input.close();
    }

	public static void main(String[] args) {
		pattern();
	}

}
