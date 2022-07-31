package dev.patika.java101;

public class PalindromNumbers {
	
	public static boolean isPalindrome(int number) {
	
	    int temp = number;
	    int reverseNum=0,lastNum;
	    
	    while(temp>0){
	        lastNum = temp % 10;
	        reverseNum = reverseNum*10 + lastNum;
	        temp /= 10;
	    }
	    if(number == reverseNum){
	        return true;
	    }
	    else{
	        return false;
	    }
	}	

	public static void main(String[] args) {
		// This is an example that provides to find palindrom numbers.
		
		 System.out.println(isPalindrome(4223));
		 System.out.println(isPalindrome(12321));
		

	}

}
