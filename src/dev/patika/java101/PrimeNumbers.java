package dev.patika.java101;

public class PrimeNumbers {

	public static void main(String[] args) {
		// Code to print prime numbers from 1 to 100
		
//		String prime = "";
//		int counter = 0;
//		for (int i = 1; i <= 100; i++) {
//			for (int j = i ; j >= 1; j--) {
//				if(i % j == 0) {
//					counter++;
//				}
//				
//			}
//			if(counter == 2) {
//				prime = prime + i + " ";
//			}
//			
//
//		}
//		System.out.println(prime);
		
		
		 int kontrol = 0;
	        for(int i = 2; i< 100;i++){
	            for(int k=2;k<i;k++)
	            {
	                if(i%k == 0){
	                    kontrol = 1;
	                    break;
	                }
	            }
	            if(kontrol == 0) 
	            System.out.print(i + " - ");
	            kontrol = 0;
	}
}
}