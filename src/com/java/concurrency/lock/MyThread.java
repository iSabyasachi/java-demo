package com.java.concurrency.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
	static ReentrantLock l = new ReentrantLock();
	
	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		do {
			try {
				if(l.tryLock(100, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName()+" ...got lock");
					Thread.sleep(2000);
					l.unlock();
					System.out.println(Thread.currentThread().getName()+" ...releases lock");
					break;
				}else {
					System.out.println(Thread.currentThread().getName()+" ...didnot get lock.Trying again");					
				}
				
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}while(true);
	}
}
