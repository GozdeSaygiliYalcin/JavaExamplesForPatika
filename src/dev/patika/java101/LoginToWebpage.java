package dev.patika.java101;

import java.util.Scanner;

public class LoginToWebpage {
	
	private static Scanner input =new Scanner(System.in);

	public static void main(String[] args) {
		//This is an example that shows login to web page step by step. If the password or username is wrong you cannot login.
		
		String userName;
		String password;
		String quit = "quit";
	
		while(true) {
		
		System.out.print("Welcome, please enter your username: ");
		userName = input.next();
		
		System.out.print("Please enter your password: ");
		password = input.next();
		
		
			if(userName.equals("gözde") && password.equals("123")) {
				System.out.println("You are logged in succesfully");
				break;
			} else {
				System.out.println("Error, you have to reset your password");
				do {

				System.out.print("Please enter the new password you want to change: ");
					String newPassword =input.next();
					if(newPassword.equals("123")) {
						System.out.println("your new password cannot be the same as old password ");
					}else {
						System.out.println("your password is created successfully!");
						break;
					}	
				
				} while (quit.equals("quit"));
				System.out.println("Bye");
				break;
			}
		}
	}
}