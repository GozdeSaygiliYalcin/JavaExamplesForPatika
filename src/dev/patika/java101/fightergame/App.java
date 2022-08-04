package dev.patika.java101.fightergame;

public class App {

	public static void main(String[] args) {
		
		 Fighter chun = new Fighter("Chun-Li" , 15 , 100, 90, 0);
	     Fighter ken = new Fighter("Ken Masters" , 10 , 95, 100, 0);
	     Ring r = new Ring(chun, ken , 90 , 100);
	     r.run();
	     
	    }
}
