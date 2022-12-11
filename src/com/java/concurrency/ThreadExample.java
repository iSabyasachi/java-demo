package com.java.concurrency;
/*
 * Producer - Consumer example using wait() and notify()
 * */
public class ThreadExample {
	
	public static void main(String[] args) throws InterruptedException{
		final PC pc = new PC();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}			
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
			}			
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
	}
	
}
