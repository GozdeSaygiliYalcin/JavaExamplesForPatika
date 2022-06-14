package dev.patika.java102.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadRace implements Runnable {
	
	 List<Integer> oddNumbers = new ArrayList<>();
	 List<Integer> evenNnumbers = new ArrayList<>();
	 List<Integer> subArr;
	 
	 public ThreadRace(List<Integer> subArr) {
	        this.subArr = subArr;
	    }

	@Override
	public void run() {
		find(this.subArr);
        print(Thread.currentThread().getName());	
	}
	
	  private synchronized void find(List<Integer> subArr) {
	        for (int i = 0; i < subArr.size(); i++) {
	            int num = subArr.get(i);
	            if (num % 2 == 0) {
	            	evenNnumbers.add(num);
	            } else {
	            	oddNumbers.add(num);

	            }
	        }
	    }
	    private void print(String threadName){
	        System.out.println(threadName + ": " + evenNnumbers);
	        System.out.println(threadName + ": " + oddNumbers);

	    }
	}


