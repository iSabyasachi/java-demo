package com.java.concurrency.lock;

public class ReentrantLockDemo {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("Thread 1");
		MyThread t2 = new MyThread("Thread 2");
		
		t1.start();
		t2.start();
	}
}
