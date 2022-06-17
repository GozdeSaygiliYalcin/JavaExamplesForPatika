package dev.patika.java101;

public class ForPractice {

	public static void main(String[] args) {
	
		int sum = 0;
		for (int i = 0, j = 0; i < 5 || j < 5; ++i, j = i + 1) {  //(0,0; 1,2) sum=1,
																 // (1,2; 2,3) sum=2,
																//i veya j 5 ten küçük olana kadar devam ettiği için 4,3,2,1 toplanıyor.
		   sum += i;
		}
		System.out.println(sum);
	}

}
