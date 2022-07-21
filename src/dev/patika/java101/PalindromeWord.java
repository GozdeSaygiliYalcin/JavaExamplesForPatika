package dev.patika.java101;
/*
 * kullanıcının girdiği kelimenin 
 * "Palindromik" olup olmadığı bulan bir program
 */
public class PalindromeWord {
	
	public static boolean isPalindrome(String str) { //1. metot
        int start = 0;
        int finish = str.length() - 1;
        while (start < finish) {
            if (str.charAt(start) != str.charAt(finish))
                return false;
            start++;
            finish--;
        }
        return true;
	}
	
	public static boolean isPalindrome2(String str) {
		
		String reverse = "";
		for (int i = str.length()-1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
			
		}
		if(str.equals(reverse)) { //equals bir dizeyi belirtilen nesneyle karşılaştırıyor
			return true;
		} 
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("hello"));
		System.out.println(isPalindrome2("hello"));
		System.out.println(isPalindrome("abaraba"));
		System.out.println(isPalindrome2("abaraba"));
	}
}
