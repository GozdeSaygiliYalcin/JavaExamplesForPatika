package dev.patika.java101;
/*
 *N elemanlı bir kümenin elemanları ile oluşturulacak
 * r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. 
 * N’in r’li kombinasyonu C(n,r) şeklinde gösterilir. C(n,r) = n! / (r! * (n-r)!)
 */


public class CombinationFactorial {
	
	public int combination(int n, int r) {
		
		int difference = (n-r);
		int factorDif = 1;
		int factorR = 1;
		int factorN = 1;
		
		for(int i=1; i <= n; i++) {
			factorN = factorN*i;
		}
		
		for (int j = 1; j <= r; j++) {
			factorR = factorR*j;
		}
		
		for (int k = 1; k <=  difference; k++) {
			factorDif = factorDif*k;
		}
		int result = factorN /(factorR*factorDif);
		return result ;
	}
	public static void main(String[] args) {
		
		CombinationFactorial cf = new CombinationFactorial();
		System.out.println(cf.combination(12, 5));

	}

}
