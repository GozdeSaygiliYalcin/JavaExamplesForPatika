package dev.patika.java101.minesweeper;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the game");
		System.out.print("Please enter the rows: ");
		int row = input.nextInt();
		System.out.print("Please enter the columns: ");
		int column = input.nextInt();
		
		MineSweeperGame game = new MineSweeperGame(row, column);
		game.run();
		input.close();
	}

}
