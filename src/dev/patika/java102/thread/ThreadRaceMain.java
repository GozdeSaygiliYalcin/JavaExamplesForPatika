package dev.patika.java102.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadRaceMain {

	public static void main(String[] args) {
		List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i <10001;i++ ){
            integerList.add(i);
        }
        ExecutorService pool1 = Executors.newFixedThreadPool(4);
        ExecutorService pool2 = Executors.newFixedThreadPool(4);
        ExecutorService pool3 = Executors.newFixedThreadPool(4);
        ExecutorService pool4 = Executors.newFixedThreadPool(4);

        List<Integer> part1 = integerList.subList(0,2500);
        List<Integer> part2 = integerList.subList(2500,5000);
        List<Integer> part3 = integerList.subList(5000,7500);
        List<Integer> part4 = integerList.subList(7500,10000);

        ThreadRace t1 = new ThreadRace(part1);
        pool1.execute(t1);
        ThreadRace t2 = new ThreadRace(part2);
        pool2.execute(t2);
        ThreadRace t3 = new ThreadRace(part3);
        pool3.execute(t3);
        ThreadRace t4 = new ThreadRace(part4);
        pool4.execute(t4);



	}

}
