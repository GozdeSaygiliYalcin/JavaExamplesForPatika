package dev.patika.java101;

import java.util.Scanner;

public class ObebOkek {

	public static void main(String[] args) {

		int x,y;
		int obeb=0;
		int okek = 0;
		
			
			Scanner o1 = new Scanner(System.in);
			System.out.println("Please enter two numbers");
			x = o1.nextInt();
			y = o1.nextInt();
			
			for (int i=1; i<=x && i<=y; i++) {
				if(x%i == 0 && y%i == 0) 
				obeb = i;
				okek= (x*y)/(obeb);
				
			}
			o1.close();
			System.out.println("obeb" +" " + obeb+ " "+"and okek" +" " +okek);
	}
}