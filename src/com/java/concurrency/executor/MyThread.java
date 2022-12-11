package com.java.concurrency.executor;

public class MyThread implements Runnable{
	int val;
	int sum;
	public MyThread(int val) {
		this.val = val;
		this.sum = 0;
	}
	
	@Override
	public void run() {		
		try {
			for(int i = 1 ; i <= val ; i++) {
				sum += i;
			}
			Thread.sleep(5000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" "+sum);
	}

}
