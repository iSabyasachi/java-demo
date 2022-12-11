package com.java.concurrency;

import java.util.LinkedList;

public class PC {
	// Create a list shared by producer and consumer
    // Size of list is 2.
	int capacity = 2;
	LinkedList<Integer> list = new LinkedList<>();
	
	public void produce() throws InterruptedException {
		int value = 0;
		synchronized(this) {
			while(true) {
				if(list.size() == capacity) {
					wait();
				}
				System.out.println("Producer produced-"+ value);
				
				list.add(value++);
				
				//wake up consumer thread
				notify();
				
				//and sleep
				Thread.sleep(1000);
			}
		}
	}
	
	public void consume() throws InterruptedException {
		synchronized(this) {
			while(true) {
				if(list.size() == 0) {
					wait();
				}
				int val = list.removeFirst();
				System.out.println("Consumer consumed-"+ val);
				
				//wake up producer thread
				notify();
				
				//and sleep
				Thread.sleep(1000);
			}
		}
	}
}
