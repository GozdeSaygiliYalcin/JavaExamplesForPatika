package dev.patika.java101.minesweeper;

import java.util.Random;
import java.util.Scanner;

public class MineSweeperGame {
	int rowNum;
	int colNum;
	int [][] map;
	int [][] currentMap;
	int size;
	boolean game = true;
	
	Random rnd = new Random();
	Scanner input = new Scanner(System.in);

	public MineSweeperGame(int rowNum, int colNum) {
		super();
		this.rowNum = rowNum;
		this.colNum = colNum;
		this.map = new int[rowNum][colNum];
		this.currentMap = new int[rowNum][colNum];
		this.size = rowNum*colNum;

	}
	public void run() {
		
		int successChoice = 0;
		
		putMine();
		print(map);
		System.out.println("Game has started");
		
		while(game) {
			print(currentMap);
			System.out.print("Row: ");
			int row = input.nextInt();
			System.out.print("Column: ");
			int col = input.nextInt();
			
			if(row < 0 || row >= rowNum) {
				System.out.println("Invalid move");
				continue;
			}
			if(col < 0 || col >= colNum) {
				System.out.println("Invalid move");
				 continue;
			}
			if(map[row][col] != -1) {
				checkAround(row, col);
				successChoice++;
				if(successChoice++ == size/4) {
					System.out.println("You win. Congrulations!");
					break;
				}
			}
			else {
			game = false;
			System.out.println("You lost");
			}
		}
	}
	public void checkAround(int row, int col) { //etrafındaki mayınları hesaplayan metot
		if(map[row][col] == 0) {
			if((col<colNum-1) && (map[row][col+1] == -1)) {
				currentMap[row][col]++;
			}
			if((row<rowNum-1) && (map[row+1][col] == -1)) {
				currentMap[row][col]++;
		    }
			if((row > 0) && (map[row-1][col] == -1)) {
				currentMap[row][col]++;
			}
			if((col > 0) && (map[row][col-1] == -1)) {
				currentMap[row][col]++;
			}
			if(currentMap[row][col] == 0) {
				currentMap[row][col] = -2;
			}
		}
	}
	public void print(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] >= 0) { //0 ve -1leri düzgün olarak hizalamayı sağlıyor
					System.out.print(" ");
				}
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	/*
	 * tahta boyutunun 4te biri kadar olan kısıma 
	 * random olarak mayın yerleştirilmesini sağlıyor
	 */
	public void putMine() { 
		
		int rndRow;
		int rndCol;
		int mineCount = 0;
		
		while (mineCount != (size/4)) {
			rndRow = rnd.nextInt(rowNum);
			rndCol =rnd.nextInt(colNum);
			
			if(map[rndRow][rndCol] != -1) {
				
				map[rndRow][rndCol] = -1;
				mineCount++;
			}
		}
		
	}
}
