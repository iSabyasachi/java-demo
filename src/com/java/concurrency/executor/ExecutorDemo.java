package com.java.concurrency.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {
		MyThread[] threads = {
				new MyThread(10),
				new MyThread(20),
				new MyThread(30),
				new MyThread(40),
				new MyThread(50)
		};
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		for(MyThread thread : threads) {
			es.submit(thread);
		}
		
		System.out.println("Shutting Down!");
		es.shutdown();
	}
}
