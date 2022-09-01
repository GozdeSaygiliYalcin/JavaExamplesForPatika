package dev.patika.java101.minesweeper;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to the game");
		System.out.println("Please enter the rows");
		System.out.println("Please enter the columns");
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int column = input.nextInt();
		
		MineSweeperGame game = new MineSweeperGame(row, column);
		game.run();
		input.close();
	}

}
